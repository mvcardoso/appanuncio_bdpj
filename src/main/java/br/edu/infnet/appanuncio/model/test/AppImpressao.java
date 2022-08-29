package br.edu.infnet.appanuncio.model.test;

import br.edu.infnet.appanuncio.interfaces.IPrinter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppImpressao {

    public static void relatorio(String mensagem, IPrinter iprinter){
        System.out.println(mensagem);
        iprinter.impressao();
    }

    public static void main(String args[]) {

//        String dir = "C:\\infnet\\appanuncio\\src\\main\\resources";
//        String arq = "anuncio.txt";
//
//        try {
//            try {
//                FileReader fileReader = new FileReader(dir+arq);
//                BufferedReader leitura = new BufferedReader(fileReader);
//
//                String linha  = leitura.readLine();
//                while (linha != null){
//                    System.out.println(linha);
//                linha = leitura.readLine();
//                }
//
//
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


    }


}
