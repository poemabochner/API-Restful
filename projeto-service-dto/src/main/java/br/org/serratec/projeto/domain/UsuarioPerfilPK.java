package br.org.serratec.projeto.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class UsuarioPerfilPK {

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Long idUsuario;

	@ManyToOne
	@JoinColumn(name = "id_perfil")
	private Long idPerfil;

	public Perfil getIdPerfil;

	public void setIdUsuario(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	public Usuario getIdUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setIdPerfil(Perfil perfil) {
		// TODO Auto-generated method stub

	}

}
