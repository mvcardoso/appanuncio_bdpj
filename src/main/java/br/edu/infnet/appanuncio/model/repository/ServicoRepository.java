package br.edu.infnet.appanuncio.model.repository;

import br.edu.infnet.appanuncio.model.domain.Servico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends CrudRepository<Servico, Integer> {

}
