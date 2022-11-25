package br.edu.infnet.appanuncio.model.repository;

import br.edu.infnet.appanuncio.model.domain.Automovel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface AutomovelRepository extends CrudRepository<Automovel, Integer> {

    @Query("FROM Automovel a WHERE a.usuario.id = :idUsuario")
    Collection<Automovel> findAll(Integer idUsuario);


    List<Automovel> findByMarca(String marca);
}
