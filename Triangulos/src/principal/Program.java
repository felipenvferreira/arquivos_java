package principal;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Entre com o valor de x: ");
		int x = sc.nextInt();
		System.out.println("Entre com o valor de y: ");
		int y = sc.nextInt();
		System.out.println("Entre com o valor de z: ");
		int z = sc.nextInt();
		
		triangulo.retornaTipoTrinangulo(x, y, z);
		System.out.println(triangulo.tipoTriangulo);
		
		
		
		sc.close();

	}

}
