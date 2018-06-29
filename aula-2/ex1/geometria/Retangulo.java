package geometria;

public class Retangulo extends Poligono{
	public Retangulo(double ladoA, double ladoB){
		this.setNome("Retangulo");
		this.setLados(new double[]{ladoA, ladoB, ladoA, ladoB});
	}

	public double getArea(){
		return this.getLados()[0]*this.getLados()[1];
	}
}
