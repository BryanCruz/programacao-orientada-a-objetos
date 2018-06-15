package pctbanco;

public class Banco {
    private Conta[] contas = new Conta[10];
    private int idAtual = 0;

    /*  recebe como argumento o depósito
        inicial e retorna o id da nova conta */
    public int abrirConta(double deposito){
        if(idAtual >= 10) return -1;
        if(deposito < 0) deposito = 0;

        this.contas[idAtual] = new Conta();        
        this.contas[idAtual].setId(idAtual+1);
        this.contas[idAtual].setSaldo(deposito);

        return ++idAtual;
    }

    /*  recebe o id da conta e um valor como argumento.
        Um valor negativo representa saque. O método deve 
        imprimir um erro caso a conta fique negativa. */
    public void transacao(int id, double valor){
        if(idValido(id)){
            double saldoAtual = this.contas[id-1].getSaldo();
            double saldoFinal = saldoAtual + valor;
            if(saldoFinal >= 0){
                this.contas[id-1].setSaldo(saldoFinal);
                System.out.printf("Transação efetuada com sucesso\nSaldo final: %.2f\n", saldoFinal);
            }else{
                System.out.printf("Erro: Saldo não é suficiente\nSaldo atual: %.2f\n",  saldoAtual);
            }
        }
    }

    /* recebe como argumento o id da conta e imprime o saldo atual */
    public void saldo(int id){
        if(idValido(id)){
            System.out.printf("ID: %d\n"     , this.contas[id-1].getId());
            System.out.printf("Saldo: %.2f\n", this.contas[id-1].getSaldo());
        }
    }

    private boolean idValido(int id){
        return id >= 1 && id <= 10;
    } 
}   