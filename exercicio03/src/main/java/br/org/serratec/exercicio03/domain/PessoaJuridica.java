package br.org.serratec.exercicio03.domain;

import javax.persistence.Column;

public class PessoaJuridica extends Fornecedor {
	@Column
	private String razaoSocial;
	@Column
	private String cnpj;
	@Column
	private String insEstadual;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInsEstadual() {
		return insEstadual;
	}

	public void setInsEstadual(String insEstadual) {
		this.insEstadual = insEstadual;
	}
}