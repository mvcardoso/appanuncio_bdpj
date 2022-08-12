package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.model.domain.Automovel;
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
        a1.id = 0001L;
        a1.descricaoCompleta = "Carro completo, economico, IPVA pago...";
        a1.preco = 40.000;
        a1.marca = "Honda";
        a1.modelo = "FIT";
        a1.km = 70000;


        new AppImpressao("++++++++Inclusão Automóvel+++++++++").relatorio(a1);


        Automovel a2 = new Automovel();
        a2.id = 0002L;
        a2.descricaoCompleta = "Carro com pouco tempo de uso...";
        a2.preco = 37.000;
        a2.marca = "Volkswagen";
        a2.modelo = "UP";
        a2.km = 15000;


        new AppImpressao("++++++++Inclusão Automóvel+++++++++").relatorio(a2);

        Automovel a3 = new Automovel();
        a3.id = 0003L;
        a3.descricaoCompleta = "Moto em perfeito estado...";
        a3.preco = 10.000;
        a3.marca = "Honda";
        a3.modelo = "BIZ";
        a3.km = 30000;


        new AppImpressao("++++++++Inclusão Automóvel+++++++++").relatorio(a3);
    }
}
