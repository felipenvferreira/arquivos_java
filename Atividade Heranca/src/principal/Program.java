package principal;

import java.util.Scanner;

import entities.Funcionario;
import entities.Gerente;
import entities.Secretaria;

public class Program {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Jose","Financeiro", 'M', 50, 5000);
		Funcionario gerente = new Gerente("Janaina", "Gerente RH", 'F', 20, 7500);
		Funcionario secretaria = new Secretaria("Leone", "Secretario escolar", 'M', 23, 1200);
		
		funcionario.bonificacao();
		gerente.bonificacao();
		secretaria.bonificacao();
		
		System.out.println(funcionario);
		System.out.println(gerente);
		System.out.println(secretaria);

	}

}
