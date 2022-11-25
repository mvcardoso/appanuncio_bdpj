package br.edu.infnet.appanuncio.service;

import br.edu.infnet.appanuncio.model.domain.Automovel;
import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.model.repository.AutomovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AutomovelService {

    @Autowired
    private AutomovelRepository automovelRepository;


    public void incluir (Automovel automovel){
        automovelRepository.save(automovel);

    }


    public Collection<Automovel> obterLista(){

        return (Collection<Automovel>) automovelRepository.findAll();
    }

    public Collection<Automovel> obterLista(Usuario usuario){

        return (Collection<Automovel>) automovelRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id){
        automovelRepository.deleteById(id);
    }
}
