package br.edu.infnet.appanuncio.controller;

import br.edu.infnet.appanuncio.model.domain.Servico;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ServicoController {

    private static Map<Integer, Servico> mapaServico = new HashMap<Integer, Servico>();
    private static Integer id = 1;

    @GetMapping(value = "/servico/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterLista());
        return "servico/lista";
    }

    @GetMapping(value = "/servico/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        System.out.println("Exclusão de Servico feita");
        return "redirect:/servico/lista";
    }

    public static void incluir(Servico servico){
        servico.setId(id++);
        mapaServico.put(servico.getId(), servico);
        AppImpressao.relatorio("++++++++Inclusão Serviço: ", servico);
    }

    public static Collection<Servico> obterLista(){
        return mapaServico.values();
    }

    public static void excluir(Integer id){
        mapaServico.remove(id);
    }
}
