package br.edu.infnet.appanuncio.controller;

import br.edu.infnet.appanuncio.model.domain.Anuncio;
import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.service.AnuncioService;
import br.edu.infnet.appanuncio.service.ItemService;
import br.edu.infnet.appanuncio.service.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class AnuncioController {

    @Autowired
    private AnuncioService anuncioService;

    @Autowired
    private ResponsavelService responsavelService;

    @Autowired
    private ItemService itemService;

    @GetMapping(value = "/anuncio")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario){
        model.addAttribute("responsavel", responsavelService.obterLista(usuario));
        model.addAttribute("itens", itemService.obterLista());

        return "anuncio/cadastro";
    }

    @GetMapping(value = "/anuncio/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){
        model.addAttribute("listagem", anuncioService.obterLista(usuario));
        return "anuncio/lista";
    }

    @GetMapping(value = "/anuncio/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        anuncioService.excluir(id);
        return "redirect:/anuncio/lista";
    }

    @PostMapping(value = "/anuncio/incluir")
    public String incluir (Anuncio anuncio, @SessionAttribute("user") Usuario usuario){
         anuncio.setUsuario(usuario);
         anuncioService.incluir(anuncio);
        return "redirect:/anuncio/lista";
    }


}
