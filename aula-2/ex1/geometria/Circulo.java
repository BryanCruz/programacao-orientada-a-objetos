package geometria;

class Circulo extends Forma {
	private double raio;
	private static double pi = 3.14;

	public Circulo(double raio){
		this.setRaio(raio);
		this.setNome("Circulo");
	}

	public double getRaio(){
		return this.raio;
	}

	public void setRaio(double raio){
		this.raio = raio;
	}

	public double getArea() {
		return pi * this.raio*this.raio;
	}

	public double getPerimetro(){
		return 2*pi*this.raio;
	}
}
