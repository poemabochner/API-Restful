package br.org.serratec.exercicio03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.exercicio03.domain.Veiculo;

@Repository
	public interface VeiculoRepository extends JpaRepository<Veiculo,Long>{
	}
