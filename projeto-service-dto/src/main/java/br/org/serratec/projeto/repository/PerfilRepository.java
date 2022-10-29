package br.org.serratec.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.projeto.domain.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {

}
