package principal;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[50];
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o n�mero da posi��o " + i + ": ");
			numeros[i] = scanner.nextInt();
		}
		System.out.println("N�meros pares e suas posi��es: ");
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0){
				System.out.println("Posi��o do n�mero: " + i + " N�mero par: " + numeros[i]);
			}
		}
	}

}
