package br.edu.infnet.appanuncio.controller;

import br.edu.infnet.appanuncio.model.domain.Anuncio;
import br.edu.infnet.appanuncio.model.domain.Automovel;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AnuncioController {

    private static Map<Integer, Anuncio> mapaAnuncio = new HashMap<Integer, Anuncio>();
    private static Integer id = 1;

    @GetMapping(value = "/anuncio/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterLista());
        return "anuncio/lista";
    }

    @GetMapping(value = "/anuncio/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        System.out.println("Exclusão de anuncio feita");
        return "redirect:/anuncio/lista";
    }

    public static void incluir (Anuncio anuncio){
        anuncio.setId(id++);
        mapaAnuncio.put(anuncio.getId(), anuncio);
        AppImpressao.relatorio("++++++++Inclusão Anuncio+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ", anuncio);
    }


    public static Collection<Anuncio> obterLista(){
        return mapaAnuncio.values();
    }

    public static void excluir(Integer id){
        mapaAnuncio.remove(id);
    }


}
