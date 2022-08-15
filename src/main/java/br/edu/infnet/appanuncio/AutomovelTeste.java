package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.model.domain.Automovel;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;

@Component
@Order(2)
public class AutomovelTeste implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Automovel a1 = new Automovel();
        a1.setId(0001L);
        a1.setDescricaoCompleta("Carro completo, economico, IPVA pago...");
        a1.setPreco(40.000);
        a1.setMarca("Honda");
        a1.setModelo("FIT");
        a1.setKm(70000);


        AppImpressao.relatorio("++++++++Inclusão Automóvel+++++++++",a1);


        Automovel a2 = new Automovel();
        a2.setId(0002L);
        a2.setDescricaoCompleta("Carro com pouco tempo de uso...");
        a2.setPreco(37.000);
        a2.setMarca("Volkswagen");
        a2.setModelo("UP");
        a2.setKm(15000);


        AppImpressao.relatorio("++++++++Inclusão Automóvel+++++++++",a2);

        Automovel a3 = new Automovel();
        a3.setId(0003L);
        a3.setDescricaoCompleta("Moto em perfeito estado...");
        a3.setPreco(10.000);
        a3.setMarca("Honda");
        a3.setModelo("BIZ");
        a3.setKm(30000);


        AppImpressao.relatorio("++++++++Inclusão Automóvel+++++++++",a3);
    }
}
