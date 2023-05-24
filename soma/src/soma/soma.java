package soma;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero1;
		int numero2;
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		int resultado = numero1 + numero2;
		
		System.out.println("A soma dos dois números foi de: " + resultado);
		leia.close();
	}

}
