package calculo_salario;

import java.util.Scanner;

public class calculo_salario {

		public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double salario;
				
		System.out.println("Digite seu salario bruto: ");
		salario = leia.nextDouble();
		
		double inss = salario * 0.05;
		double ir = salario * 0.11;
		double resultado = salario - inss - ir;
		
		System.out.println("Seu salario liquido � de: R$ " + resultado);
		System.out.println("O valor referente ao desconto do INSS � de: R$ " + inss);
		System.out.println("O valor referente ao desconto do IR � de: R$ " + ir);

		leia.close();
	}

}
