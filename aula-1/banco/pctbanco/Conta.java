package pctbanco;

class Conta{
    int id;
    double saldo;

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void imprimirSaldo(){
        System.out.printf("ID: %d\n"      , this.id);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }
}