public class MeuGuardaEncomenda implements GuardaEncomenda {
	private Encomenda[] encomendas;
	private int qtdEncomendas = 0;
	private static final int max = 1000;
	
	public Encomenda[] getEncomendas(){
		return this.encomendas;
	}

	public int getQtdEncomendas(){
		return this.qtdEncomendas;
	}

	public void setQtdEncomendas(int qtdEncomendas){
		this.qtdEncomendas = qtdEncomendas;
	}

	public MeuGuardaEncomenda(){
		encomendas = new Encomenda[max]; 
		this.setQtdEncomendas(0);
	}

	@Override
	public void adiciona(Encomenda e){
		int qtdAtual = this.getQtdEncomendas();

		if(qtdAtual >= max) return;

		Encomenda[] v = this.getEncomendas();		
		
		for(int i = 0; i < qtdAtual; i++){
			if(v[i].compareTo(e) == 0) return;
		}

		v[qtdAtual] = e; 
		this.setQtdEncomendas(qtdAtual+1);

	}
	
	@Override
	public int getSize(){
		return this.getQtdEncomendas();
	}

	@Override
	public String toString(){
		String ret = "";
		int tamanho = this.getQtdEncomendas();
		Encomenda[] vetorEncomendas = this.getEncomendas();

		for(int i = 0; i < tamanho; ++i){
			ret = ret + vetorEncomendas[i] + ", ";
		}

		return ret;
	}

	@Override
	public void ordena(){
		quickSort(this.getEncomendas(), 0, this.getQtdEncomendas()-1);	
	}

	private void quickSort(Encomenda[] v, int min, int max){
		if(min >= max) return;	

		Encomenda p = v[min]; 
		int w       = min + 1;

		for(int i = min; i <= max; i++){
			if(v[i].compareTo(p) < 0){
				Encomenda tmp = v[w];
				v[w] 		  = v[i];
				v[i] 		  = tmp;
				w++;
			}
		}
	
		Encomenda tmp     = v[min];
		v[min] 		  = v[w-1];
		v[w-1] 		  = tmp;

		quickSort(v, min, w - 2);
		quickSort(v, w, max);
	}
}





























