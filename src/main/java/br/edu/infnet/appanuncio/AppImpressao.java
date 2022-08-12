package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.model.domain.Item;

public class AppImpressao {

    private String mensagem;

    public AppImpressao(String mensagem) {
        this.mensagem = mensagem;
    }

    public  void relatorio(Item item){
        System.out.println(mensagem);
        item.impressao();
    }


}
