package mostrar_numero;

import java.util.Scanner;

public class mostrar_numero {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero1;
		
		System.out.println("Digite um n�mero: ");
		numero1 = leia.nextInt();
		
		System.out.println("O n�mero informado foi: " + numero1);
		leia.close();
	}

}
