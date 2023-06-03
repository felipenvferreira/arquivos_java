package principal;

import java.util.Scanner;

public class somaArgumentos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os 3 numeros a serem somados: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
		somarNumeros(numero1, numero2, numero3);
		
		sc.close();

	}
	static void somarNumeros(int n1, int n2, int n3) {
		System.out.print("A Soma dos números é: " + (n1 + n2 + n3));
		
	}

}
