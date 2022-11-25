package br.edu.infnet.appanuncio.controller;

import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@SessionAttributes("user")
@Controller
public class AppController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping(value = "/")
    public String telaHome(Model model){

        //model.addAttribute("projeto", appService.obterProjeto());
        return "home";
    }

    @GetMapping(value = "/login")
    public String telaLogin(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam String email, @RequestParam String senha){

        Usuario usuario = usuarioService.validar(email, senha);

        if(usuario != null) {
            model.addAttribute("user", usuario);
            return "home";
        }

            return "/login";

    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session, SessionStatus status){
        status.setComplete();
        session.removeAttribute("user");
        return "redirect:/";
    }
}
