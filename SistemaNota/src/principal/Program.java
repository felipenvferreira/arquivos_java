package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] notas = new double[4];
		System.out.println("Entre com o nome do Aluno: ");
		String nomeAluno = sc.nextLine();
		
		double somaNotas = 0;
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Entre com a nota "+ (i + 1) + ": ");
			notas[i] = sc.nextDouble();
			somaNotas += notas[i];
		}
		System.out.println("A media do aluno " + nomeAluno + " �: " + somaNotas / notas.length);
		
	}
}