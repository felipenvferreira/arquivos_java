package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva a primeira nota");
		double nota1 = leia.nextDouble();
		
		System.out.println("Escreva a segunda nota");
		double nota2 = leia.nextDouble();
		
		System.out.println("Escreva a terceira nota");
		double nota3 = leia.nextDouble();
		
		System.out.println("Escreva a quarta nota");
		double nota4 = leia.nextDouble();
		
		double media = ((nota1 + nota2 + nota3 + nota4)/4);
		
		if(media < 6) {
			System.out.println("Sua m�dia foi de: " + media + " REROVADO!");
		} if((media <= 6) && (media < 7)) {
			System.out.println("Sua m�dia foi de: " + media + " RECUPERA��O!");
		}if((media >= 7) && (media < 10)) {
			System.out.println("Sua m�dia foi de: " + media + " APROVADO!");
		}if(media == 10) {
			System.out.println("Sua m�dia foi de: " + media + " APROVADO COM HONRAS!");
		}
		
		leia.close();
		
	}

}
