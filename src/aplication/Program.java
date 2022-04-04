package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entity.Pessoa;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Pessoa pessoa = new Pessoa("Joao", sdf.parse("10/12/1950"), 1.68);
		
		System.out.print( pessoa.getNome() + " nasceu em " + sdf.parse("10/12/1950") + " e sua idade é de " + pessoa.CalcularIdade() + " anos. ");
		
		
		

	}

}
