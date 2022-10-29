package br.org.serratec.cliente.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.cliente.domain.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	
}
