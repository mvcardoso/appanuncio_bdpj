package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.controller.UsuarioController;
import br.edu.infnet.appanuncio.model.domain.Usuario;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UsuarioTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        Usuario usuario = new Usuario();
        usuario.setEmail("marcus@mail");
        usuario.setNome("Marcus");
        usuario.setSenha("123");

        UsuarioController.incluir(usuario);

    }
}
