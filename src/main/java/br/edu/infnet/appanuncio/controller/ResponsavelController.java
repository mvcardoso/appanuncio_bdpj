package br.edu.infnet.appanuncio.controller;

import br.edu.infnet.appanuncio.model.domain.Responsavel;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ResponsavelController {

    private static Map<Integer, Responsavel> mapaResponsavel = new HashMap<Integer, Responsavel>();
    private static Integer id = 1;

    @GetMapping(value="/responsavel/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterLista());
        return "responsavel/lista";
    }

    public static void incluir(Responsavel responsavel){
        responsavel.setId(id++);
        mapaResponsavel.put(responsavel.getId(), responsavel);
        AppImpressao.relatorio("", responsavel);

    }

    @GetMapping(value = "/responsavel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        System.out.println("Exclusão de responsavel feita");
        return "redirect:/responsavel/lista";
    }

    public static Collection<Responsavel> obterLista(){
        return mapaResponsavel.values();
    }

    public static void excluir(Integer id){
        mapaResponsavel.remove(id);
    }
}
