package entity;

import java.util.Calendar;
import java.util.Date;

/*
 * Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e altura. 
 * Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos dados de uma pessoa. 
 * Crie um método para calcular a idade da pessoa.
 */

public class Pessoa {

	private String nome;
	private Date nascimento;
	private double altura;

	public Pessoa() {
	}

	public Pessoa(String nome, Date data, double altura) {
		this.nome = nome;
		this.nascimento = data;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int CalcularIdade(int idade) {
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(nascimento);
		Calendar hoje = Calendar.getInstance();

		idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

		if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
			idade--;
		} else {
			if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)
					&& hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
				idade--;
			}
		}

		return idade;
	}
}
