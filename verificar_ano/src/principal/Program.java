package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
				
		System.out.println("Digite um ano: ");
		int ano = leia.nextInt();
		
		boolean bissexto = false;
		
		if(ano % 4 == 0) {
			if(ano % 100 != 0 || ano % 400 == 0) {
				bissexto = true;
			}
		}
		
		if(bissexto) {
			System.out.println(ano + " é um ano bissexto");
		}
		else {
			System.out.println(ano + " não é um ano bissexto");
		}
		
		leia.close();		

	}

}
