package conversor_de_temperatura;

import java.util.Scanner;

public class conversor_de_temperatura {

		public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double temperatura1;
		
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		temperatura1 = leia.nextDouble();
		
		double conversao = 5 * ((temperatura1 - 32)/9);
		
		System.out.println("A temperatura em graus Celsius � de: " + conversao);
		leia.close();

	}

}
