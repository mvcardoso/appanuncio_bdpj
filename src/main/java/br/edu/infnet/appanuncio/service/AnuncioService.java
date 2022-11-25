package br.edu.infnet.appanuncio.service;

import br.edu.infnet.appanuncio.model.domain.Anuncio;
import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.model.repository.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AnuncioService {

    @Autowired
    AnuncioRepository anuncioRepository;

    public void incluir (Anuncio anuncio){
        anuncioRepository.save(anuncio);
    }

    public Collection<Anuncio> obterLista(){
        return (Collection<Anuncio>) anuncioRepository.findAll();
    }

    public Collection<Anuncio> obterLista(Usuario usuario){
        return (Collection<Anuncio>) anuncioRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id){
        anuncioRepository.deleteById(id);
    }
}
