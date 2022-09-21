package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.controller.AnuncioController;
import br.edu.infnet.appanuncio.model.domain.Anuncio;
import br.edu.infnet.appanuncio.model.domain.Automovel;
import br.edu.infnet.appanuncio.model.domain.Responsavel;
import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.model.exceptions.AnuncioSemItemException;
import br.edu.infnet.appanuncio.model.exceptions.NomeInvalidoException;
import br.edu.infnet.appanuncio.model.exceptions.ResponsavelNuloException;
import br.edu.infnet.appanuncio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(1)
public class UsuarioTeste implements ApplicationRunner {

    @Autowired
    private UsuarioService usuarioService;


    private Usuario usuario;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        usuario = new Usuario();
        usuario.setEmail("marcus@mail");
        usuario.setNome("Marcus");
        usuario.setSenha("123");


        usuarioService.incluir(usuario);
        //usuarioService.incluir(usuario);


        String dir = "C:\\infnet\\appanuncio\\src\\main\\resources\\";
        String arq = "usuario.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha  = leitura.readLine();
                while (linha != null){
                    String[] campos = linha.split(";");

                    usuario = new Usuario();
                    usuario.setNome(campos[0]);
                    usuario.setEmail(campos[1]);
                    usuario.setSenha(campos[2]);

                    usuarioService.incluir(usuario);

                    linha = leitura.readLine();

                }
                leitura.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println(dir+arq);
                System.out.println("Arquivo não existe");
            } catch (IOException e) {
                System.out.println("Problema no fechamento");
            }
        }
        finally {
            System.out.println("Funcionou");
        }

    }
}
