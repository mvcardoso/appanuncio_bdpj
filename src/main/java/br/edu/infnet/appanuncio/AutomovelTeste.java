package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.controller.AutomovelController;
import br.edu.infnet.appanuncio.model.domain.Automovel;
import br.edu.infnet.appanuncio.model.exceptions.KilometroInvalidoException;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(2)
public class AutomovelTeste implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args)  {

        String dir = "C:\\infnet\\appanuncio\\src\\main\\resources\\";
        String arq = "automovel.txt";

        try {
            try {

                FileReader fileReader = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null) {

                    try {

                        String[] campos = linha.split(";");

                        Automovel a1 = new Automovel();
                        a1.setId(new Integer(campos[0]));
                        a1.setDescricaoCompleta(campos[1]);
                        a1.setPreco(new Double(campos[2]));
                        a1.setMarca(campos[3]);
                        a1.setModelo(campos[4]);
                        a1.setKm(new Integer(campos[5]));
                        AutomovelController.incluir(a1);
                        System.out.println(a1.calcularPrecoComJuros());
                        linha = leitura.readLine();
                    } catch (KilometroInvalidoException e) {
                        System.out.println(">>>ERRO AUTOMOVEL<<<<" + e.getMessage());
                        linha = leitura.readLine();
                    }
                }
                leitura.close();
                fileReader.close();

            } catch (FileNotFoundException e) {
                System.out.println(">>>ARQUIVO AUTOMOVEL NÃO EXISTE<<<<" + e.getMessage());
            } catch (IOException e) {
                System.out.println("Problema no fechamento");
            }
        }
        finally {
            System.out.println("Funcionou");
        }

        System.out.println();

//        try {
//            Automovel a2 = new Automovel();
//            a2.setId(2);
//            a2.setDescricaoCompleta("Carro com pouco tempo de uso...");
//            a2.setPreco(37.000);
//            a2.setMarca("Volkswagen");
//            a2.setModelo("UP");
//            a2.setKm(15000);
//            System.out.println(a2.calcularPrecoComJuros());
//            AutomovelController.incluir(a2);
//        } catch (KilometroInvalidoException e) {
//            System.out.println(">>>ERRO AUTOMOVEL<<<<" + e.getMessage());
//        }
//
//
//
//        try {
//            Automovel a3 = new Automovel();
//            a3.setId(3);
//            a3.setDescricaoCompleta("Moto em perfeito estado...");
//            a3.setPreco(10.000);
//            a3.setMarca("Honda");
//            a3.setModelo("BIZ");
//            a3.setKm(30000);
//            System.out.println(a3.calcularPrecoComJuros());
//            AutomovelController.incluir(a3);
//        } catch (KilometroInvalidoException e) {
//            System.out.println(">>>ERRO AUTOMOVEL<<<<" + e.getMessage());
//        }

    }
}
