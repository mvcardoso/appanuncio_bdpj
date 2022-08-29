package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.controller.AnuncioController;
import br.edu.infnet.appanuncio.model.domain.*;
import br.edu.infnet.appanuncio.model.exceptions.AnuncioSemItemException;
import br.edu.infnet.appanuncio.model.exceptions.NomeInvalidoException;
import br.edu.infnet.appanuncio.model.exceptions.ResponsavelNuloException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Component
@Order(1)
public class AnuncioTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args)  {
        Set<Item> listaItens01 = new HashSet<Item>();

        Imovel i1 = new Imovel();
        i1.setId(1);
        i1.setDescricaoCompleta("Vendo casa de 4 quartos");
        i1.setPreco(170.000);
        i1.setTipoImovel("Casa");
        i1.setCidade("Brasilia");
        i1.setArea(80);

        Servico s1 = new Servico();
        s1.setId(1);
        s1.setDescricaoCompleta("Móveis planejados 2");
        s1.setPreco(200.0);
        s1.setTipoServico("Marcenaria");
        s1.setRedeSocial("instagram.com/marcenaria");
        s1.setNotaAvaliacao(4.0);


        String dir = "C:\\infnet\\appanuncio\\src\\main\\resources\\";
        String arq = "anuncio.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha  = leitura.readLine();
                while (linha != null){

                    try {
                        String[] campos = linha.split(";");

                        Automovel at1 = new Automovel();

                        listaItens01.add(at1);
                        listaItens01.add(i1);
                        listaItens01.add(s1);

                        Responsavel r1 = new Responsavel(campos[2], campos[3], campos[4], campos[5]);
                        Anuncio a1 = new Anuncio(r1, listaItens01);
                        a1.setTitulo(campos[0]);
                        a1.setStatus(campos[1]);
                        AnuncioController.incluir(a1);
                        linha = leitura.readLine();
                    } catch (NomeInvalidoException | ResponsavelNuloException | AnuncioSemItemException e) {
                       System.out.println("[ERRO] - [ANUNCIO]" + e.getMessage());
                        linha = leitura.readLine();
                    }

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

        System.out.println();

//
//        try {
//            Responsavel  r2 = new Responsavel("Vinicius", "88888888", "vinicius@vinicius", "456");
//            Imovel i1 = new Imovel();
//            i1.setId(2);
//            i1.setDescricaoCompleta("Vendo casa de 3 quartos");
//            i1.setPreco(170.000);
//            i1.setTipoImovel("Casa");
//            i1.setCidade("Brasilia");
//            i1.setArea(80);
//            AppImpressao.relatorio("++++++++Inclusão Imóvel+++++++++", i1);
//            listaItens01.add(i1);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Responsavel  r3 = new Responsavel("José", "77777777", "jose@jose", "789");
//
//            Servico s1 = new Servico();
//            s1.setId(3);
//            s1.setDescricaoCompleta("Móveis planejados");
//            s1.setPreco(100.0);
//            s1.setTipoServico("Marcenaria");
//            s1.setRedeSocial("instagram.com/marcenaria");
//            s1.setNotaAvaliacao(4.0);
//
//            Set<Item> listaItens02 = new HashSet<Item>();
//            listaItens02.add(s1);
//
//            Anuncio a3 = new Anuncio(r3, listaItens02);
//            a3.setTitulo("Moto Honda Biz 2019");
//            a3.setStatus("Ativo");
//            AppImpressao.relatorio("++++++++Inclusão Anuncio+++++++++",a3);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
