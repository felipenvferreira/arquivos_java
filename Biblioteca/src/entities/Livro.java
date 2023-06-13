package entities;

public class Livro {
	
	/*
	 * Ordem sugerida a seguir na classe:
	 * 1� atributos da classe
	 * 2� construtores
	 * 3� metodo get e set
	 * 4� demais metodos
	 * get � para obter e set para atribuir
	 * quando precisa de dados obrigat�rios faz o construtor (alt + shift + S)
	 * o this � uma palavra para distinguir o que � atribuido da classe para o parametro recebido
	 */
	
	private String titulo;
	private int edicao;
	private double valorLivro;
	
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Livro(String titulo, int edicao, double valorLivro) {
		super();
		this.titulo = titulo;
		this.edicao = edicao;
		this.valorLivro = valorLivro;
	}

	public double getValorLivro() {
		return valorLivro;
	}

	public void setValorLivro(double valorLivro) {
		if(valorLivro > 100) {
			this.valorLivro = valorLivro + (valorLivro * 0.30);
		}
		
	}
	
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nEdi��o: " + edicao + "\nValor: " + valorLivro;
	}
	

}
