package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 variaveis s�o espa�os alocados na mem�ria que salvam uma informa��o (um dado)
		 o tipo int armazena n�meros inteiros
		 int s�o n�meros: 1,2,3,10,150...
		 double que s�o n�meros com casas decimais
		 exemplo: 10.50,25.99,3.54
		 char � o tipo que armazena um caractere � um tipo "literal" e sua inicializa��o � feita com aspas simples
		 exemplos de char: c, d, a, 1, 2...
		 String � uma classe do java utilizada para armazenar cadeias de caracteres
		 sua inicializa��o � feita com aspas duplas
		 exemplos: nomes, locais...
		 */
		
		int numero = 10;
		double precoDaCamisa = 20.52;
		String nome = "Felipe Ferreira";
		char sexo = 'M';
		
		System.out.println(numero);
		System.out.println(precoDaCamisa);
		System.out.println(nome);
		System.out.println(sexo);
	 
		precoDaCamisa = 50.65;
		System.out.println(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(nome);
		System.out.print(sexo);
		System.out.print(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(" " + nome + " " + sexo + " " + " " + precoDaCamisa);
		System.out.println();
		
		System.out.println(nome + " comprou uma camisa com o valor de: R$ " + precoDaCamisa);
		
		nome = "Ferreira Felipe";
		precoDaCamisa = 29.90;
		
		System.out.print(nome + " comprou uma camisa com o valor de: R$ " + precoDaCamisa);
		System.out.println();
		
		System.out.println(2 + 2);
		
		int numero1 = 5;
		int numero2 = 10;
		int resultado = numero1 + numero2;
		System.out.println(numero1 + numero2);
		System.out.println("O resultado � " + resultado);
		
		/*
		 crie uma variavel com seu nome 
		 crie uma variavel com sua idade
		 mostre na tela a frase: Luan muruk tem 32 anos e possui 5 reias na conta
		 */
		
		String nome3 = "Felipe Ferreira";
		int idade = 32;
		int saldo = 10;
		
		System.out.println(nome3 + " tem " + idade + " anos e possui " + saldo + " reais na conta");
	}

}
