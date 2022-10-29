package org.serratec.backend.exercicio01.repository;

import java.util.List;

import org.serratec.backend.exercicio01.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findAll();

}
