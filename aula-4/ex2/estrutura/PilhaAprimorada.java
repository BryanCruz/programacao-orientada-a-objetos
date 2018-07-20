package estrutura;

public class PilhaAprimorada extends PilhaSimples {
	public PilhaAprimorada(int tamanhoMax){
		super(tamanhoMax);
	}

	@Override
	public void empilha(Object item) throws PilhaCheiaException {
		if(this.getTopo() + 1 < this.getTamanhoMax()) 
			super.empilha(item);
		else throw new PilhaCheiaException(this.getTamanhoMax(), item);
	}

	@Override
	public Object desempilha() throws PilhaVaziaException {
		if(this.getTopo() >= 0) 
			return super.desempilha();
		else throw new PilhaVaziaException();
	}
	
}
