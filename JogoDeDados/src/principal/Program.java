package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random randon = new Random();

		int dado1 = randon.nextInt(6) + 1;
		int dado2 = randon.nextInt(6) + 1;
		int dado3 = randon.nextInt(6) + 1;

		System.out.println("Valor Dado 1: " + dado1);
		System.out.println("Valor Dado 2: " + dado2);
		System.out.println("Valor Dado 3: " + dado3);

		int total = dado1 + dado2 + dado3;

		System.out.println("A soma dos dados foi de: " + total);

		if ((dado1 == dado2) || (dado1 == dado3) || (dado2 == dado3)) {
			if (dado1 == dado2 && dado2 == dado3) {
				System.out.println("Sortudo. Ganhou mais 6 pontos!");
				total = total + 6;
				System.out.println("Total de pontos com b�nus foi de: " + total);
			}

			else {
				System.out.println("Ganhou mais 2 pontos!");
				total = total + 2;
				System.out.println("Total de pontos com b�nus foi de: " + total);

			}
		}

		if (total >= 15) {
			System.out.println("Parab�ns, voc� ganhou!");
		} else {
			System.out.println("Lamento, mas voc� perdeu");
		}
	}

}
