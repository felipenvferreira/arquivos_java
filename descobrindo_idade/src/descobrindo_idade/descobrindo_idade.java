package descobrindo_idade;

import java.util.Scanner;

public class descobrindo_idade {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int nascimento;
		int ano;
		
		System.out.println("Digite o ano de nascimento: ");
		nascimento = leia.nextInt();
		System.out.println("Digite o ano corrente: ");
		ano = leia.nextInt();
		
		int calculo = ano - nascimento;
		
		System.out.println("Sua idade � de: " + calculo + " anos");

		leia.close();
	}

}
