package br.edu.infnet.appanuncio.service;

import br.edu.infnet.appanuncio.model.domain.Automovel;
import br.edu.infnet.appanuncio.model.repository.AutomovelRepository;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AutomovelService {

    @Autowired
    private AutomovelRepository automovelRepository;


    public void incluir (Automovel automovel){
        automovelRepository.save(automovel);
        AppImpressao.relatorio("++++++++Inclusão Automóvel++++++++++++++++++++++++++++++++++++++++ "
                        + "\n" + automovel.getMarca(),
                automovel);
    }


    public Collection<Automovel> obterLista(){

        return (Collection<Automovel>) automovelRepository.findAll();
    }

    public void excluir(Integer id){
        automovelRepository.deleteById(id);
    }
}
