package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random randon = new Random();
		
		int opcao = randon.nextInt (8) + 1;
		
		System.out.println(opcao);
				
		switch (opcao) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Ter�a-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
			
		default:
			System.out.println("N�o corresponde a um dia da semana");
			break;
		}
		
		/*if(opcao == "Sexta-feira") {
			System.out.println("Sextou!!!");
		}
		else if (opcao.equals("Quarta-feira")){
			System.out.println("O dia selecionado � quarta-feira");
		}
		else {
			System.out.println("N�o corresponde a um dia da semana");
		}*/
	}

}
