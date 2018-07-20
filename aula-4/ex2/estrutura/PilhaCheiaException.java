package estrutura;

public class PilhaCheiaException extends PilhaException {
	private int limite;
	private Object item;

	public PilhaCheiaException(int limite, Object item){
		super("A pilha está cheia!");
		this.setLimite(limite);
		this.setItem(item);
	}
	
	private void setLimite(int limite){
		this.limite = limite;
	}

	public int getLimite(){
		return this.limite;
	}

	public Object getItem(){
		return this.item;
	}

	private void setItem(Object item){
		this.item = item;
	}
}
