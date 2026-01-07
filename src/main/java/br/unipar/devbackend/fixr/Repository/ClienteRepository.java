package br.unipar.devbackend.fixr.Repository;

import br.unipar.devbackend.fixr.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
