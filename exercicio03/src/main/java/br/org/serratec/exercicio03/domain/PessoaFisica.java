package br.org.serratec.exercicio03.domain;

import javax.persistence.Column;

public class PessoaFisica extends Fornecedor {
	@Column
	private String rg;
	@Column
	private String orgaoEmisso;
	@Column
	String cpf;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoEmisso() {
		return orgaoEmisso;
	}

	public void setOrgaoEmisso(String orgaoEmisso) {
		this.orgaoEmisso = orgaoEmisso;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}