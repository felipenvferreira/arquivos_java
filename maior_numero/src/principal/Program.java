package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		
		System.out.println("Número 1: ");
		int numero1 = leia.nextInt();
		
		System.out.println("Número 2: ");
		int numero2 = leia.nextInt();
		
		System.out.println("Número 3: ");
		int numero3 = leia.nextInt();
		
		int maior = numero1;
		
		if(numero2 > maior) {
			maior = numero2;
		}
		if(numero3 > maior) {
			maior = numero3;
		}
		
		System.out.println("O maior número é: " + maior);
		
		leia.close();
		
	}

}
