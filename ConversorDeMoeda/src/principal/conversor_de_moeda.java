package principal;

import java.util.Scanner;

public class conversor_de_moeda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do dólar: ");
		double valorCotacao = sc.nextDouble();
		
		System.out.println("Entre com o valor a ser convertido: ");
		double valorAConverter = sc.nextDouble();
		
		converterDolar(valorCotacao, valorAConverter);
		
		sc.close();
		
	}
		static void converterDolar(double cotacao, double valor) {
			double valorConvertidoParaDolar = valor / cotacao;
			double valorConvertidoParaReal = valor * cotacao;
			System.out.printf("Valor convertido de real para dolar: %.2f", valorConvertidoParaDolar);
			System.out.printf("\nValor convertido de dolar para real: %.2f", valorConvertidoParaReal);
		}

}
