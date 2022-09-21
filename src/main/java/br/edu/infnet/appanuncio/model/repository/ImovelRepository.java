package br.edu.infnet.appanuncio.model.repository;

import br.edu.infnet.appanuncio.model.domain.Imovel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends CrudRepository<Imovel, Integer> {
}
