package receber_numero;

import java.util.Scanner;

public class receber_numero {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextDouble();
		
		double resultado = nota1 + nota2 + nota3 + nota4;
		double media = (resultado/4);
		
		System.out.println("A m�dia deste aluno foi de " + media);
		leia.close();
	}

}
