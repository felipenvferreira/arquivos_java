package horas_trabalhadas;

import java.util.Scanner;

public class horas_trabalhadas {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int valor_hora;
		int horas;
		System.out.println("Digite quanto ganha por hora: ");
		valor_hora = leia.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		horas = leia.nextInt();
		
		int calculo = valor_hora * horas;
		
		System.out.println("Seu sal�rio no m�s � de: R$ " + calculo);
		leia.close();
	}

}
