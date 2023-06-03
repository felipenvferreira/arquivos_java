package entities;

public class Triangulo {
	public String tipoTriangulo;
	
	public String retornaTipoTrinangulo(int x, int y, int z) {
		if(x == y && y == z) {
			tipoTriangulo = "Triagulo equilatero";
			return tipoTriangulo;
		}else if(x == y || x == z || y == z) {
			tipoTriangulo = "Triangulo isosceles";
			return tipoTriangulo;
		}else {
			tipoTriangulo = "Triangulo escaleno";
			return tipoTriangulo;
		}
	}

}
