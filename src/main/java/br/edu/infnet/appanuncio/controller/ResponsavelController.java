package br.edu.infnet.appanuncio.controller;

import br.edu.infnet.appanuncio.model.domain.Responsavel;
import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import br.edu.infnet.appanuncio.service.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ResponsavelController {

    private String mensagem;

    @Autowired
    ResponsavelService responsavelService;

    @GetMapping(value="/responsavel/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario ){
        model.addAttribute("listagem", responsavelService.obterLista(usuario));
        model.addAttribute("mensagem", mensagem);
        return "responsavel/lista";
    }

    @GetMapping(value="/responsavel")
    public String telaCadastro(Model model){
        model.addAttribute("listagem", responsavelService.obterLista());
        return "responsavel/cadastro";
    }

    @PostMapping (value = "/responsavel/incluir")
    public String incluir(Responsavel responsavel, @SessionAttribute("user") Usuario usuario){
        responsavel.setUsuario(usuario);
        responsavelService.incluir(responsavel);

        mensagem = "Inclusão do responsável "+ responsavel.getNome() +" realizada com sucesso";
        return "redirect:/responsavel/lista";
    }

//    public static void incluir(Responsavel responsavel){
//        responsavel.setId(id++);
//        mapaResponsavel.put(responsavel.getId(), responsavel);
//        AppImpressao.relatorio("", responsavel);
//
//    }

    @GetMapping(value = "/responsavel/{id}/excluir")
    public String excluir(@PathVariable Integer id){

        try {
            responsavelService.excluir(id);
            mensagem = "Exclusão  do responsável "+ id +" realizada com sucesso";
        }
        catch (Exception e){
            System.out.println("[ERRO]" + e.getMessage());
        }


        return "redirect:/responsavel/lista";
    }

}
