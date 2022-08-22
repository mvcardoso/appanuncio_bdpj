package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.controller.ResponsavelController;
import br.edu.infnet.appanuncio.model.domain.Responsavel;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ResponsavelTeste implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(">>>>>>Responsável<<<<<<");

        Responsavel r1 = new Responsavel("Marcus", "99999999", "marcus@marcus", "123");
        ResponsavelController.incluir(r1);

        Responsavel r2 = new Responsavel("Vinicius", "88888888", "vinicius@vinicius", "456");
        ResponsavelController.incluir(r2);

        Responsavel r3 = new Responsavel("José", "77777777", "jose@jose", "789");
        ResponsavelController.incluir(r3);
    }
}
