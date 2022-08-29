package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.controller.AutomovelController;
import br.edu.infnet.appanuncio.controller.ImovelController;
import br.edu.infnet.appanuncio.model.domain.Imovel;
import br.edu.infnet.appanuncio.model.exceptions.PrecoNegativoException;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import ch.qos.logback.core.util.InvocationGate;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(3)
public class ImovelTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {

        String dir = "C:\\infnet\\appanuncio\\src\\main\\resources\\";
        String arq = "imovel.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null) {

                    try {
                        String[] campos = linha.split(";");

                        Imovel i1 = new Imovel();
                        i1.setId(new Integer(campos[0]));
                        i1.setDescricaoCompleta(campos[1]);
                        i1.setPreco(new Double(campos[2]));
                        i1.setTipoImovel(campos[3]);
                        i1.setCidade(campos[4]);
                        i1.setArea(new Integer(campos[5]));
                        ImovelController.incluir(i1);
                        i1.calcularPrecoComJuros();
                        linha = leitura.readLine();
                    } catch (PrecoNegativoException e) {
                        System.out.println(">>[ERRO] IMOVEL<<" + e.getMessage());
                        linha = leitura.readLine();
                    }
                }
                leitura.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println(">>>ARQUIVO IMOVEL NÃO EXISTE<<<<" + e.getMessage());
            } catch (
                    IOException e) {
                System.out.println("Problema no fechamento");
            }
        }
        finally {
            System.out.println("Funcionou");
        }
        System.out.println();
    }


//        try {
//            Imovel i2 = new Imovel();
//            i2.setId(2);
//            i2.setDescricaoCompleta("Vendo apartamento de 2 quartos");
//            i2.setPreco(120.000);
//            i2.setTipoImovel("Apartamento");
//            i2.setCidade("São Paulo");
//            i2.setArea(50);
//            ImovelController.incluir(i2);
//            i2.calcularPrecoComJuros();
//        } catch (PrecoNegativoException e) {
//            System.out.println(">>ERRO IMOVEL<<" + e.getMessage());
//        }
//
//
//
//        try {
//            Imovel i3 = new Imovel();
//            i3.setId(3);
//            i3.setDescricaoCompleta("Alugo kitnet");
//            i3.setPreco(800.00);
//            i3.setTipoImovel("Kitnet");
//            i3.setCidade("Brasilia");
//            i3.setArea(40);
//            ImovelController.incluir(i3);
//            i3.calcularPrecoComJuros();
//        } catch (PrecoNegativoException e) {
//            System.out.println(">>ERRO IMOVEL<<" + e.getMessage());
//        }

}

