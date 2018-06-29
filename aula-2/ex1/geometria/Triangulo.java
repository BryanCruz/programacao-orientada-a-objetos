package geometria;
import  java.lang.Math;

public class Triangulo extends Poligono{
	public Triangulo(double ladoA, double ladoB, double ladoC){
		this.setNome("Triangulo");
		this.setLados(new double[]{ladoA, ladoB, ladoC});
	}
	
	public double getArea(){
		double semiP = this.getPerimetro()/2;
		
		double semiA = semiP;
		for(double lado : this.getLados()){
			semiA *= (semiP - lado);
		}

		return Math.sqrt(semiA); 
	}
}
