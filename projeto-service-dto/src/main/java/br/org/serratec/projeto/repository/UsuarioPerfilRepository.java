package br.org.serratec.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.projeto.domain.UsuarioPerfil;
import br.org.serratec.projeto.domain.UsuarioPerfilPK;

public interface UsuarioPerfilRepository extends JpaRepository<UsuarioPerfil, UsuarioPerfilPK> {

}
