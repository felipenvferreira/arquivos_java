package soma;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero1;
		int numero2;
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = leia.nextInt();
		
		int resultado = numero1 + numero2;
		
		System.out.println("A soma dos dois n�meros foi de: " + resultado);
		leia.close();
	}

}
