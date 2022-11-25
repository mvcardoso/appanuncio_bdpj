package br.edu.infnet.appanuncio.service;

import br.edu.infnet.appanuncio.model.domain.Imovel;
import br.edu.infnet.appanuncio.model.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public void incluir (Imovel imovel){
        imovelRepository.save(imovel);

    }

    public Collection<Imovel> obterLista(){
        return (Collection<Imovel>) imovelRepository.findAll();
    }

    public void excluir(Integer id){
        imovelRepository.deleteById(id);
    }
}
