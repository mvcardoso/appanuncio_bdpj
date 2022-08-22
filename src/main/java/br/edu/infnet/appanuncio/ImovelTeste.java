package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.controller.AutomovelController;
import br.edu.infnet.appanuncio.controller.ImovelController;
import br.edu.infnet.appanuncio.model.domain.Imovel;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ImovelTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(">>>>>>Imóvel<<<<<<");

        Imovel i1 = new Imovel();
        i1.setId(1);
        i1.setDescricaoCompleta("Vendo casa de 3 quartos");
        i1.setPreco(170.000);
        i1.setTipoImovel("Casa");
        i1.setCidade("Brasilia");
        i1.setArea(80);
        ImovelController.incluir(i1);

        Imovel i2 = new Imovel();
        i2.setId(2);
        i2.setDescricaoCompleta("Vendo apartamento de 2 quartos");
        i2.setPreco(120.000);
        i2.setTipoImovel("Apartamento");
        i2.setCidade("São Paulo");
        i2.setArea(50);
        ImovelController.incluir(i2);

        Imovel i3 = new Imovel();
        i3.setId(3);
        i3.setDescricaoCompleta("Alugo kitnet");
        i3.setPreco(800.00);
        i3.setTipoImovel("Kitnet");
        i3.setCidade("Brasilia");
        i3.setArea(40);
        ImovelController.incluir(i3);
    }
}
