package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		//adiciona dados na lista
		nomes.add("Felipe");
		nomes.add("Maira");
		nomes.add("Lara");
		nomes.add("Sofia");
		nomes.add("Francisco");
		
		//mostra os dados da lista
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		//remove os dados da lista
		//nomes.remove(2);
		for(String nome: nomes) {
			System.out.println("Nome: " + nome);
		}
		
		//obtem o dado da lista por indice (posi��o na memoria)
		System.out.println(nomes.get(3));
		
		String dado = nomes.stream().filter(x -> x == "Felipe").findFirst().orElse(null);
		
		Collections.sort(nomes);
		
		System.out.println("Imprimindo em ordem alfabetica");
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		System.out.println(dado);
	}
	
}
