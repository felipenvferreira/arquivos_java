package principal;

public class Program {

	public static void main(String[] args) {
		
		/*mais utilizada quando j� sabemos 
		a quantidade de vezes que precisamos repetir os comandos
		*/
		
		/*SINTAXE do For
		 * 1� variavel que inicia o contador;
		   2� condi��o que deve ser aceita;
		   3� incremento*/
		
		int soma = 0;
		
		for(int numero = 1; numero <= 25; numero++) {
			if(numero % 2 == 1) {
			System.out.println("N�meros �mpares: ");
			System.out.println(numero);
			soma += numero;
			}
		}
			System.out.println("A soma dos n�meros �mpares �: " + soma);
			
	}

} 


            //System.out.println(numero + "\t" ou " ");
			