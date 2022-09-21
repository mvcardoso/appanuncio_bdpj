package br.edu.infnet.appanuncio.service;

import br.edu.infnet.appanuncio.model.domain.Responsavel;
import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.model.repository.ResponsavelRepository;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class ResponsavelService {

    @Autowired
    private ResponsavelRepository responsavelRepository;

    public void incluir(Responsavel responsavel){
        responsavelRepository.save(responsavel);
        AppImpressao.relatorio("Inclusão do Responsável", responsavel);
    }

    public Collection<Responsavel> obterLista(){
        return (Collection<Responsavel>) responsavelRepository.findAll();
    }

    public Collection<Responsavel> obterLista(Usuario usuario){
        return responsavelRepository.obterLista(usuario.getId());
    }

    public void excluir(Integer id){
        responsavelRepository.deleteById(id);
    }
}
