package entity;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private Date data;
	private double altura;
	
	public Pessoa() {
	}

	public Pessoa(String nome, Date data, double altura) {
		this.nome = nome;
		this.data = data;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	

	public Date CalcularIdade() {
	Date idade = new Date();
		return idade;
	}

}
