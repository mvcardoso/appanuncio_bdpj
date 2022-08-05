package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.model.domain.Anuncio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
@Order(1)
public class AnuncioTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(">>>>>>Anuncio<<<<<<");

        Anuncio a1 = new Anuncio();
        a1.setTitulo("Honda FIT 2015 Completo");
        a1.setStatus("Ativo");
        a1.setDataCadastro(new Date());
        System.out.println(a1);

        Anuncio a2 = new Anuncio();
        a2.setTitulo("UP 2017 Pouco uso");
        a2.setStatus("Inativo");
        a2.setDataCadastro(new Date());
        System.out.println(a2);

        Anuncio a3 = new Anuncio();
        a3.setTitulo("Moto Honda Biz 2019");
        a3.setStatus("Ativo");
        a3.setDataCadastro(new Date());
        System.out.println(a3);
    }
}
