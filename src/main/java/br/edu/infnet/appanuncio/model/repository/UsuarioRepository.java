package br.edu.infnet.appanuncio.model.repository;

import br.edu.infnet.appanuncio.model.domain.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    @Query("FROM Usuario u WHERE u.email = :email")
    Usuario findByEmail(String email);

    @Query("FROM Usuario u ORDER BY u.email ASC")
    Collection<Usuario> obterLista();

}
