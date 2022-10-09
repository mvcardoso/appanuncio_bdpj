package br.edu.infnet.appanuncio.model.repository;

import br.edu.infnet.appanuncio.model.domain.Anuncio;
import br.edu.infnet.appanuncio.model.domain.Automovel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface AnuncioRepository extends CrudRepository<Anuncio, Integer> {

    @Query("FROM Anuncio a WHERE a.usuario.id = :idUsuario")
    Collection<Anuncio> findAll(Integer idUsuario);
}
