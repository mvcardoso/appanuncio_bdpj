package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.controller.ResponsavelController;
import br.edu.infnet.appanuncio.model.domain.Responsavel;
import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.model.exceptions.NomeInvalidoException;
import br.edu.infnet.appanuncio.service.ResponsavelService;
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
@Order(2)
public class ResponsavelTeste implements ApplicationRunner {

    @Autowired
    ResponsavelService responsavelService;

    @Override
    public void run(ApplicationArguments args)  {


        String dir = "C:\\infnet\\appanuncio\\src\\main\\resources\\";
        String arq = "responsavel.txt";

        Usuario usuario = new Usuario();
        usuario.setId(1);

        try {
            try {
                FileReader fileReader = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null) {

                    try {
                        String[] campos = linha.split(";");

                        Responsavel r1 = new Responsavel(campos[0], campos[1], campos[2], campos[3]);
                        r1.setUsuario(usuario);
                        responsavelService.incluir(r1);
                        linha = leitura.readLine();
                    }
                    catch(NomeInvalidoException e) {
                        System.out.println(">>>>>>Erro<<<<<<" + e.getMessage());
                        linha = leitura.readLine();
                    }
                }
                leitura.close();
                fileReader.close();
            }
            catch (FileNotFoundException e) {
                System.out.println(">>>ARQUIVO RESPONSAVEL NÃO EXISTE<<<<" + e.getMessage());
            } catch (IOException e) {
                System.out.println("Problema no fechamento");
            }
        }
        finally {
            System.out.println("Funcionou");
        }

        System.out.println();
    }
}
