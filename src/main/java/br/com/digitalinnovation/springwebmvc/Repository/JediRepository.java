package br.com.digitalinnovation.springwebmvc.Repository;

import br.com.digitalinnovation.springwebmvc.model.Jedi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JediRepository extends JpaRepository {
    List<Jedi> findByNameContainingIgnoreCase(final String name);
}
