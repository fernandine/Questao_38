package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entity.Pessoa;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date nascimento = sdf.parse("10/12/1950");
		Pessoa pessoa = new Pessoa("Joao", nascimento, 1.68);
		
		System.out.print( pessoa.getNome() + " nasceu em " + sdf.format(nascimento) + " e sua idade é de " + pessoa.CalcularIdade(0) + " anos. ");
		
		
		

	}

}
