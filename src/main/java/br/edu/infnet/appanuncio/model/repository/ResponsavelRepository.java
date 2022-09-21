package br.edu.infnet.appanuncio.model.repository;

import br.edu.infnet.appanuncio.model.domain.Responsavel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResponsavelRepository extends CrudRepository<Responsavel, Integer> {

    @Query("FROM Responsavel r WHERE r.usuario.id = :userid")
    List<Responsavel> obterLista(Integer userid);
}
