public class Conta {
	private int saldo;
	private String nome;
	private int limite;

	public Conta(String nome){
		this.setNome(nome);
		this.setLimite(0);
	}

	public int getSaldo() {
		return this.saldo;
	}

	private void setSaldo(int saldo){
		this.saldo = saldo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public int getLimite(){
		return this.limite;
	}

	public void setLimite(int limite){
		this.limite = limite;
	}

	public void depositar(int valor){
		this.setSaldo(this.getSaldo() + valor);
	}

	public void sacar(int valor) throws SaldoInsuficienteException {
		if(this.getSaldo() + this.getLimite() < valor) {
			throw new SaldoInsuficienteException(this.getSaldo() + this.getLimite());
		}
		
		this.setSaldo(this.getSaldo() - valor);
	}
	
	@Override
	public String toString(){
		return String.format("%s tem %d", this.getNome(), this.getSaldo()); 
	}
}
