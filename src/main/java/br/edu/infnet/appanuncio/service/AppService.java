package br.edu.infnet.appanuncio.service;

import br.edu.infnet.appanuncio.model.domain.app.Projeto;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private Projeto projeto;

    public void incluir(Projeto projeto){
        this.projeto = projeto;
        AppImpressao.relatorio("Projeto", projeto);
    }

    public Projeto obterProjeto(){
        return projeto;
    }

}

