package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		System.out.println("Insira um nome: ");
		pessoa.nome = sc.nextLine();
		System.out.println("Ano do nascimento: ");
		int ano = sc.nextInt();
		//pessoa.retornaIdade(sc.nextInt());
		System.out.println("Insira o sexo: ");
		pessoa.sexo = sc.next().charAt(0);
		
		pessoa.retornaIdade(ano);
		
		/*pessoa.nome = "Felipe";
		pessoa.idade = 33;
		pessoa.sexo = 'M';
		
		pessoa2.nome = "Ana";
		pessoa2.idade = 30;
		pessoa2.sexo = 'F';*/
		
		
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Idade: " + pessoa.idade);
		System.out.println("sexo: " + pessoa.sexo);
		
		//System.out.println("Pessoa: " + pessoa.nome + ", " + pessoa.idade + " anos " + ", " + pessoa.sexo);
		//System.out.println("Pessoa2: " + pessoa2.nome + ", " + pessoa2.idade + " anos " + ", " + pessoa2.sexo);
		
		
		sc.close();
	}

}
