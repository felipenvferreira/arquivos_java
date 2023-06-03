package principal;

import java.util.Random;

public class Sorteios {

	public static void main(String[] args) {
System.out.println(ganhador());
		

	}
	static String ganhador() {
		Random random = new Random();
		int numeroSorteado = random.nextInt(11);
		String[]nomes = {
				"Jose Luiz",
				"Felipe Ferreira",
				"Amanda",
				"Claudia",
				"Cristina",
				"Alice",
				"Barbara",
				"Roberta",
				"Andre",
				"Jose",
		};
		return "O ganhardor foi: " + nomes[numeroSorteado];
	}
	

}
