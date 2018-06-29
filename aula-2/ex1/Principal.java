import geometria.*;

public class Principal{
	public static void main(String[] args){
		Forma a1 = new Quadrado(9);
		Forma a2 = new Retangulo(10, 9);
		Forma a3 = new Triangulo(10, 9, 8);

		a1.toString(a1);
		a2.toString(a2);
		a3.toString(a3);

	}
}
