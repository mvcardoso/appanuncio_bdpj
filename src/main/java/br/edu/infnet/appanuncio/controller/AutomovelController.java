package br.edu.infnet.appanuncio.controller;

import br.edu.infnet.appanuncio.model.domain.Automovel;
import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class AutomovelController {

    @Autowired
    AutomovelService automovelService;

    @GetMapping(value = "/automovel/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){
        model.addAttribute("listagem", automovelService.obterLista(usuario));
        return "automovel/lista";
    }

    @GetMapping(value="/automovel")
    public String telaCadastro(Model model){
        model.addAttribute("listagem", automovelService.obterLista());
        return "automovel/cadastro";
    }

    @PostMapping(value="/automovel/incluir")
    public String incluir(Automovel automovel, @SessionAttribute("user") Usuario usuario){
        automovel.setUsuario(usuario);
        automovelService.incluir(automovel);
        return "redirect:/automovel/lista";
    }

    @GetMapping(value = "/automovel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        automovelService.excluir(id);
        return "redirect:/automovel/lista";
    }


}
