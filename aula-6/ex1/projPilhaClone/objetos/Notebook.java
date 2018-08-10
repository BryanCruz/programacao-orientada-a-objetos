package objetos;

public class Notebook extends Eletronico{
	private int usbNumber;
	
	public Notebook(String serial, int usbNumber){
		super(serial);
		this.setUsbNumber(usbNumber);
	}
	public int getUsbNumber(){
		return this.usbNumber;
	}

	private void setUsbNumber(int usbNumber){
		this.usbNumber = usbNumber;
	}	

	public String toString(){
		return "Notebook-" + this.getSerial() + "-" + this.getUsbNumber();
	}
}
