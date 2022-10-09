package br.edu.infnet.appanuncio.controller;

import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;


    @GetMapping(value = "/item/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){
        model.addAttribute("listagem", itemService.obterLista(usuario));
        return "item/lista";
    }

    @GetMapping(value = "/item/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        itemService.excluir(id);
        return "redirect:/item/lista";
    }
}
