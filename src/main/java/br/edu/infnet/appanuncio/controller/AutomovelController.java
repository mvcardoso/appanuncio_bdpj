package br.edu.infnet.appanuncio.controller;

import br.edu.infnet.appanuncio.model.domain.Automovel;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class AutomovelController {

    private static Map<Integer, Automovel> mapaAutomovel = new HashMap<Integer, Automovel>();
    private static Integer id = 1;

    @GetMapping(value = "/automovel/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterLista());
        return "automovel/lista";
    }

    @GetMapping(value = "/automovel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        System.out.println("Exclusão de automovel feita");
        return "redirect:/automovel/lista";
    }

    public static void incluir (Automovel automovel){
        automovel.setId(id++);
        mapaAutomovel.put(automovel.getId(), automovel);
        AppImpressao.relatorio("++++++++Inclusão Automóvel: " + automovel.getMarca() , automovel);
    }


    public static Collection<Automovel> obterLista(){
        return mapaAutomovel.values();
    }

    public static void excluir(Integer id){
        mapaAutomovel.remove(id);
    }
}
