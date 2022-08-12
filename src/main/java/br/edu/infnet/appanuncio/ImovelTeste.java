package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.model.domain.Imovel;
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
        i1.id = 0001L;
        i1.descricaoCompleta = "Vendo casa de 3 quartos";
        i1.preco = 170.000;
        i1.tipoImovel = "Casa";
        i1.cidade = "Brasilia";
        i1.area = 80;
        System.out.println(i1);

        Imovel i2 = new Imovel();
        i2.id = 0002L;
        i2.descricaoCompleta = "Vendo apartamento de 2 quartos";
        i2.preco = 120.000;
        i2.tipoImovel = "Apartamento";
        i2.cidade = "São Paulo";
        i2.area = 50;
        System.out.println(i2);

        Imovel i3 = new Imovel();
        i3.id = 0002L;
        i3.descricaoCompleta = "Alugo kitnet";
        i3.preco = 800.00;
        i3.tipoImovel = "Kitnet";
        i3.cidade = "Brasilia";
        i3.area = 40;
        System.out.println(i3);
    }
}
