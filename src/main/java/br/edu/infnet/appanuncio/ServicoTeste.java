package br.edu.infnet.appanuncio;


import br.edu.infnet.appanuncio.controller.ServicoController;
import br.edu.infnet.appanuncio.model.domain.Servico;
import br.edu.infnet.appanuncio.model.exceptions.NotaInvalidaException;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import br.edu.infnet.appanuncio.service.ServicoService;
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
@Order(6)
public class ServicoTeste implements ApplicationRunner {

    @Autowired
    private ServicoService servicoService;

    @Override
    public void run(ApplicationArguments args) {

        String dir = "C:\\infnet\\appanuncio\\src\\main\\resources\\";
        String arq = "servico.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null) {
                    try {

                        String[] campos = linha.split(";");

                        Servico s1 = new Servico();
                        s1.setId(new Integer(campos[0]));
                        s1.setDescricaoCompleta(campos[1]);
                        s1.setPreco(new Double(campos[2]));
                        s1.setTipoServico(campos[3]);
                        s1.setRedeSocial(campos[4]);
                        s1.setNotaAvaliacao(new Double(campos[5]));
                        servicoService.incluir(s1);
                        s1.calcularPrecoComJuros();
                        linha = leitura.readLine();
                    } catch (NotaInvalidaException e) {
                        System.out.println(">>>ERRO SERVICO<<<" + e.getMessage());
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
        } finally {
            System.out.println("Funcionou");
        }

        System.out.println();

    }
}
