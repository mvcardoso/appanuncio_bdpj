package br.edu.infnet.appanuncio.controller;

import br.edu.infnet.appanuncio.model.domain.Servico;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import br.edu.infnet.appanuncio.service.ServicoService;
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
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @GetMapping(value = "/servico/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", servicoService.obterLista());
        return "servico/lista";
    }

    @GetMapping(value="/servico")
    public String telaCadastro(Model model){
        model.addAttribute("listagem", servicoService.obterLista());
        return "servico/cadastro";
    }

    @PostMapping(value="/servico/incluir")
    public String incluir(Servico servico){
        servicoService.incluir(servico);
        return "redirect:/servico/lista";
    }

    @GetMapping(value = "/servico/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        servicoService.excluir(id);
        return "redirect:/servico/lista";
    }

}
