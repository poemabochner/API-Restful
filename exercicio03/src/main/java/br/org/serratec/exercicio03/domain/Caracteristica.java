package br.org.serratec.exercicio03.domain;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.org.serratec.exercicio03.enums.Categoria;
import br.org.serratec.exercicio03.enums.Combustivel;

@Embeddable
public class Caracteristica {
private String renavam;
private String chassi;
private Long ano;
@Enumerated(EnumType.STRING)
private Categoria categoria;
private String cor;
@Enumerated(EnumType.ORDINAL)
private Combustivel combustivel;
public String getRenavam() {
	return renavam;
}
public void setRenavam(String renavam) {
	this.renavam = renavam;
}
public String getChassi() {
	return chassi;
}
public void setChassi(String chassi) {
	this.chassi = chassi;
}
public Long getAno() {
	return ano;
}
public void setAno(Long ano) {
	this.ano = ano;
}
public Categoria getCategoria() {
	return categoria;
}
public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public Combustivel getCombustivel() {
	return combustivel;
}
public void setCombustivel(Combustivel combustivel) {
	this.combustivel = combustivel;
}


}