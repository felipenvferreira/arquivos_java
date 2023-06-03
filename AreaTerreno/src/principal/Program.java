package principal;

import java.util.Scanner;

import entities.Area;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Area area = new Area();
		
		System.out.println("Insira o comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.println("Insira a largura: ");
		double largura = sc.nextDouble();
		area.retornaArea(largura, comprimento);
		
		System.out.println("A area total do terreno é: " + area.area);

		sc.close();

	}

}
