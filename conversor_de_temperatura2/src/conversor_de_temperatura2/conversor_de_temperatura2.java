package conversor_de_temperatura2;

import java.util.Scanner;

public class conversor_de_temperatura2 {

		public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double temperatura1;
		
		
		System.out.println("Digite a temperatura em Celsius: ");
		temperatura1 = leia.nextDouble();
		
		double conversao = (temperatura1 * 9/5) + 32;
		
		System.out.println("A temperatura em graus Fahrenheit � de: " + conversao);
		leia.close();
	}

}
