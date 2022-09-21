package br.edu.infnet.appanuncio.controller;


import br.edu.infnet.appanuncio.model.domain.Imovel;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import br.edu.infnet.appanuncio.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @GetMapping(value = "/imovel/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", imovelService.obterLista());
        return "imovel/lista";
    }

    @GetMapping(value="/imovel")
    public String telaCadastro(Model model){
        model.addAttribute("listagem", imovelService.obterLista());
        return "imovel/cadastro";
    }

    @PostMapping(value="/imovel/incluir")
    public String incluir (Imovel imovel){
        imovelService.incluir(imovel);
        return "redirect:/imovel/lista";
    }
    @GetMapping(value = "/imovel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        imovelService.excluir(id);
        return "redirect:/imovel/lista";
    }
}
