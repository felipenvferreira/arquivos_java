package principal;

import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com o título: ");
		String titulo = sc.nextLine();
		System.out.println("Digite a edição: ");
		int edicao = sc.nextInt();
		System.out.println("Digite o valor: R$ ");
		double valorLivro = sc.nextDouble();
		
		Livro livro = new Livro(titulo, edicao, valorLivro);
		livro.setValorLivro(valorLivro);
		
		System.out.println(livro);
		
		
		sc.close();
		

	}

}
