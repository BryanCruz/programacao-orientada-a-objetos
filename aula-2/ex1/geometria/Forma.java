package geometria;

public abstract class Forma{
	private String nome;

	public String getNome(){
		return nome;
    }

	public void setNome(String nome){
		this.nome = nome;
	}
	
	public abstract double getArea();

	public abstract double getPerimetro();

	public void toString(Forma forma){
		System.out.println("Nome: " + forma.getNome() + "\nÁrea: " + forma.getArea() + "\nPerímetro: " + forma.getPerimetro());
	}

}

