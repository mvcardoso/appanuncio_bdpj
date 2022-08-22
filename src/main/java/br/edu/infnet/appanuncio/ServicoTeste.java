package br.edu.infnet.appanuncio;


import br.edu.infnet.appanuncio.controller.ServicoController;
import br.edu.infnet.appanuncio.model.domain.Servico;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class ServicoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
    System.out.println(">>>>>>Serviço<<<<<<");

    Servico s1 = new Servico();
    s1.setId(1);
    s1.setDescricaoCompleta("Móveis planejados");
    s1.setPreco(100.0);
    s1.setTipoServico("Marcenaria");
    s1.setRedeSocial("instagram.com/marcenaria");
    s1.setNotaAvaliacao(4.0);
    ServicoController.incluir(s1);

    Servico s2 = new Servico();
    s2.setId(2);
    s2.setDescricaoCompleta("Serviço de pedreiro");
    s2.setPreco(100.0);
    s2.setTipoServico("Pedreiro");
    s2.setRedeSocial("instagram.com/pedreiro");
    s2.setNotaAvaliacao(3.0);
    ServicoController.incluir(s2);

    Servico s3 = new Servico();
    s3.setId(3);
    s3.setDescricaoCompleta( "Manicure/Pedicure");
    s3.setPreco(100.0);
    s3.setTipoServico("Estética");
    s3.setRedeSocial("instagram.com/manicure");
    s3.setNotaAvaliacao(4.0);
    ServicoController.incluir(s3);


    }
}
