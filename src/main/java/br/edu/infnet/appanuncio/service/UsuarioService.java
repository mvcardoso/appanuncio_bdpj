package br.edu.infnet.appanuncio.service;

import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();


    public static Usuario validar(String email, String senha){
        Usuario usuario = mapaUsuario.get(email);

        if (usuario != null && senha.equals(usuario.getSenha())){
            return usuario;
        }
        return null;
    }

    public static Collection<Usuario> obterLista(){
        return mapaUsuario.values();
    }


    public void incluir (Usuario usuario){
        usuarioRepository.save(usuario);
        mapaUsuario.put(usuario.getEmail(), usuario);
        //AppImpressao.relatorio("Inclusão do usuário: "+usuario.getNome());

    }

    public void excluir(String email){
        mapaUsuario.remove(email);
    }
}
