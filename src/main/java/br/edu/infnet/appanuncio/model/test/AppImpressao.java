package br.edu.infnet.appanuncio.model.test;

import br.edu.infnet.appanuncio.interfaces.IPrinter;

public class AppImpressao {

    public static void relatorio(String mensagem, IPrinter iprinter){
        System.out.println(mensagem);
        iprinter.impressao();
    }


}
