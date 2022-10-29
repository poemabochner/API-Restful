package br.org.serratec.cliente.domain;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name="Cliente", schema="public")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private Long id;
	
	@NotBlank(message="preencha o nome do cliente")
	@Size(max=60, min=2, message="tamanho inválido")
	@Column(nullable=false, length=60)
	private String nome;
	
	@CPF(message="CPF inválido")
	@Column(nullable=false, length=11)
	private String cpf;
	
	@Email(message = "Você inseriu um email não valido")
    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, name = "data_nascimento")
    private LocalDate dataNascimento;

	
    
    @Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", dataNascimento="
				+ dataNascimento + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
    
}
