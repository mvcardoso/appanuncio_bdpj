package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.controller.AnuncioController;
import br.edu.infnet.appanuncio.model.domain.*;
import br.edu.infnet.appanuncio.model.exceptions.AnuncioSemItemException;
import br.edu.infnet.appanuncio.model.exceptions.NomeInvalidoException;
import br.edu.infnet.appanuncio.model.exceptions.ResponsavelNuloException;
import br.edu.infnet.appanuncio.service.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
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
@Order(7)
public class AnuncioTeste implements ApplicationRunner {

    @Autowired
    AnuncioService anuncioService;

    @Override
    public void run(ApplicationArguments args)  {

        Usuario usuario = new Usuario();
        usuario.setId(01);

        Set<Item> itens = new HashSet<Item>();

        Automovel a1 = new Automovel();
        a1.setId(01);

        itens.add(a1);

        Responsavel responsavel = new Responsavel();
        Anuncio a = new Anuncio();

        a.setId(01);
        a.setTitulo("Descrição 01");
        a.setResponsavel(responsavel);
        a.setItens(itens);

//        anuncioService.incluir(a);

//        Set<Item> listaItens01 = new HashSet<Item>();
//
//        Responsavel responsavel = new Responsavel();
//        responsavel.setId(1);
//
//        Anuncio anuncio = new Anuncio();
//
//
//        Imovel i1 = new Imovel();
//        i1.setId(1);
//        i1.setDescricaoCompleta("Vendo casa de 4 quartos");
//        i1.setPreco(170.000);
//        i1.setTipoImovel("Casa");
//        i1.setCidade("Brasilia");
//        i1.setArea(80);
//
//        Servico s1 = new Servico();
//        s1.setId(1);
//        s1.setDescricaoCompleta("Móveis planejados 2");
//        s1.setPreco(200.0);
//        s1.setTipoServico("Marcenaria");
//        s1.setRedeSocial("instagram.com/marcenaria");
//        s1.setNotaAvaliacao(4.0);
//
//
//        String dir = "C:\\infnet\\appanuncio\\src\\main\\resources\\";
//        String arq = "anuncio.txt";
//
//        try {
//            try {
//                FileReader fileReader = new FileReader(dir+arq);
//                BufferedReader leitura = new BufferedReader(fileReader);
//
//                String linha  = leitura.readLine();
//                while (linha != null){
//
//                    try {
//                        String[] campos = linha.split(";");
//
//                        Automovel at1 = new Automovel();
//
//                        listaItens01.add(at1);
//                        listaItens01.add(i1);
//                        listaItens01.add(s1);
//
//                        Responsavel r1 = new Responsavel(campos[2], campos[3], campos[4], campos[5]);
//                        Anuncio a1 = new Anuncio(r1, listaItens01);
//                        a1.setTitulo(campos[0]);
//                        a1.setStatus(campos[1]);
//                        AnuncioController.incluir(a1);
//                        linha = leitura.readLine();
//                    } catch (NomeInvalidoException | ResponsavelNuloException | AnuncioSemItemException e) {
//                       System.out.println("[ERRO] - [ANUNCIO]" + e.getMessage());
//                        linha = leitura.readLine();
//                    }
//
//                }
//                leitura.close();
//                fileReader.close();
//            } catch (FileNotFoundException e) {
//                System.out.println(dir+arq);
//                System.out.println("Arquivo não existe");
//            } catch (IOException e) {
//                System.out.println("Problema no fechamento");
//            }
//        }
//        finally {
//            System.out.println("Funcionou");
//        }
//
//        System.out.println();
    }
}
