package br.edu.infnet.appanuncio.controller;

import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UsuarioController {

    private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();

    public static Usuario validar(String email, String senha){
        Usuario usuario = mapaUsuario.get(email);

        if (usuario != null && senha.equals(usuario.getSenha())){
            return usuario;
        }
        return null;
    }

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterLista());
        return "usuario/lista";
    }

    public static void incluir (Usuario usuario){
    mapaUsuario.put(usuario.getEmail(), usuario);
    //AppImpressao.relatorio("Inclusão do usuário: "+usuario.getNome());

    }

    public static void excluir(String email){
        mapaUsuario.remove(email);
    }


    public static Collection<Usuario> obterLista(){
        return mapaUsuario.values();
    }


    @GetMapping (value = "/usuario")
    public String telaCadastro(){
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String inclusao(Usuario usuario){
        System.out.println("Usuário" + usuario.getNome());
        incluir(usuario);
        return "redirect:/";
    }

    @GetMapping(value = "/usuario/{email}/excluir")
    public String exclusao(@PathVariable String email){
        excluir(email);
        return "redirect:/usuario/lista";
    }
}
