package geometria;

abstract class Poligono extends Forma{
	private double[] lados;

	public double[] getLados(){
		return this.lados;
	}

	public void setLados(double[] lados){
		this.lados = lados;
	}

	public double getPerimetro(){
		double perimetro = 0;
		for(double lado : this.lados){
			perimetro += lado;
		}

		return perimetro;
	}

}
