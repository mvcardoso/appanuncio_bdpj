package br.edu.infnet.appanuncio.controller;


import br.edu.infnet.appanuncio.model.domain.Imovel;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ImovelController {

    private static Map<Integer, Imovel> mapaImovel = new HashMap<Integer, Imovel>();
    private static Integer id = 1;

    @GetMapping(value = "/imovel/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterLista());
        return "imovel/lista";
    }

    @GetMapping(value = "/imovel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        System.out.println("Exclusão de imovel feita");
        return "redirect:/imovel/lista";
    }

    public static void incluir (Imovel imovel){
        imovel.setId(id++);
        mapaImovel.put(imovel.getId(), imovel);
        AppImpressao.relatorio("++++++++Inclusão Imovel: ", imovel);
    }

    public static Collection<Imovel> obterLista(){
        return mapaImovel.values();
    }

    public static void excluir(Integer id){
        mapaImovel.remove(id);
    }
}
