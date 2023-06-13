package entities;

public class Livro {
	
	/*
	 * Ordem sugerida a seguir na classe:
	 * 1° atributos da classe
	 * 2° construtores
	 * 3° metodos get e set
	 * 4° demais metodos
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
		this.valorLivro += (valorLivro * 0.30);
		} else {
			this.valorLivro = valorLivro;
		}
		
	}
	
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nEdição: n° " + edicao + "\nValor: R$ " + valorLivro;
	}
	

}
