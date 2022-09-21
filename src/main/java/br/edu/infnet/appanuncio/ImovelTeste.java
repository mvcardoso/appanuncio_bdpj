package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.controller.AutomovelController;
import br.edu.infnet.appanuncio.controller.ImovelController;
import br.edu.infnet.appanuncio.model.domain.Imovel;
import br.edu.infnet.appanuncio.model.exceptions.PrecoNegativoException;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import br.edu.infnet.appanuncio.service.ImovelService;
import ch.qos.logback.core.util.InvocationGate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(5)
public class ImovelTeste implements ApplicationRunner {

    @Autowired
    private ImovelService imovelService;

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
                        imovelService.incluir(i1);
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
}

