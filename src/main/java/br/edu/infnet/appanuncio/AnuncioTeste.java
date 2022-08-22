package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.model.domain.*;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@Order(1)
public class AnuncioTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Set<Item> listaItens01 = new HashSet<Item>();

        Responsavel r1 = new Responsavel("Marcus", "99999999", "marcus@marcus", "123");
        Responsavel r2 = new Responsavel("Vinicius", "88888888", "vinicius@vinicius", "456");
        Responsavel r3 = new Responsavel("José", "77777777", "jose@jose", "789");

        Automovel at1 = new Automovel();
        at1.setId(1);
        at1.setDescricaoCompleta("Carro completo, economico, IPVA pago...");
        at1.setPreco(40.000);
        at1.setMarca("Honda");
        at1.setModelo("FIT");
        at1.setKm(70000);

        Imovel i1 = new Imovel();
        i1.setId(2);
        i1.setDescricaoCompleta("Vendo casa de 3 quartos");
        i1.setPreco(170.000);
        i1.setTipoImovel("Casa");
        i1.setCidade("Brasilia");
        i1.setArea(80);
        AppImpressao.relatorio("++++++++Inclusão Imóvel+++++++++", i1);

        Servico s1 = new Servico();
        s1.setId(3);
        s1.setDescricaoCompleta("Móveis planejados");
        s1.setPreco(100.0);
        s1.setTipoServico("Marcenaria");
        s1.setRedeSocial("instagram.com/marcenaria");
        s1.setNotaAvaliacao(4.0);

        listaItens01.add(at1);
        listaItens01.add(at1);
        listaItens01.add(at1);
        listaItens01.add(at1);
        listaItens01.add(i1);

        Anuncio a1 = new Anuncio(r1);
        a1.setTitulo("Honda FIT 2015 Completo");
        a1.setStatus("Ativo");
        a1.setItens(listaItens01);
        //a1.setDataCadastro(LocalDateTime.now());
        //a1.setResponsavel(r1);
        AppImpressao.relatorio("++++++++Inclusão Anuncio+++++++++",a1);



        Set<Item> listaItens02 = new HashSet<Item>();
        listaItens02.add(s1);

        Anuncio a2 = new Anuncio(r2);
        a2.setTitulo("UP 2017 Pouco uso");
        a2.setStatus("Inativo");
        a2.setItens(listaItens02);
        //a2.setDataCadastro(new Date());
        //a1.setResponsavel(r2);
        AppImpressao.relatorio("++++++++Inclusão Anuncio+++++++++",a2);


        Set<Item> listaItens03 = new HashSet<Item>();
        listaItens03.add(at1);
        listaItens03.add(i1);
        listaItens03.add(s1);

        Anuncio a3 = new Anuncio(r3);
        a3.setTitulo("Moto Honda Biz 2019");
        a3.setStatus("Ativo");
        a3.setItens(listaItens03);
        //a3.setDataCadastro(new Date());
        //a1.setResponsavel(r3);
        AppImpressao.relatorio("++++++++Inclusão Anuncio+++++++++",a3);
    }
}
