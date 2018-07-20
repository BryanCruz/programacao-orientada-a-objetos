public class SaldoInsuficienteException extends Exception {
	private int saldo;

	public SaldoInsuficienteException(int saldo){
		super("O saldo da conta eh insuficiente!");
		this.setSaldo(saldo);
	}

	public int getSaldo() {
		return this.saldo;
	}

	private void setSaldo(int saldo){
		this.saldo = saldo;
	}

}
