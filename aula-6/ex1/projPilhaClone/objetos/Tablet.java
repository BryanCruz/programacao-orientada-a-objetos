package objetos;

public class Tablet extends Eletronico {
	public Tablet(String serial){
		super(serial);
	}

	public String toString(){
		return "Tablet-" + this.getSerial();
	}
}
