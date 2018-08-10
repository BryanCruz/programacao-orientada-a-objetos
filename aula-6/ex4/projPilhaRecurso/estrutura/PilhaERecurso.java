package estrutura;

public class PilhaERecurso extends PilhaE implements AutoCloseable{
	public PilhaERecurso(int tamanhoMax){
		super(tamanhoMax);
	}

	@Override
	public void close(){
		int itensRemovidos = 0;
		while(this.getTopo() >= 0){
			this.desempilha();
			itensRemovidos++;
		}

		if(itensRemovidos > 0)
			System.out.println("Pilha foi esvaziada! Tinha " + itensRemovidos + " itens.");
	}
}
