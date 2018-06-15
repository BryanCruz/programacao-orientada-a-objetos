import pctbanco.Banco;

public class Principal{
    public static void main(String[] args){
        // Versão 1:
        // Conta salario     = new Conta();
        // Conta poupanca    = new Conta();
        // Conta multiplicao = new Conta();

        // salario.setId(1);
        // poupanca.setId(2);
        // multiplicao.setId(3);
    
        // salario.setSaldo(51);
        // poupanca.setSaldo(42.21123);
        // multiplicao.setSaldo(3);

        // salario.imprimirSaldo();
        // poupanca.imprimirSaldo();
        // multiplicao.imprimirSaldo();
        
        // Versão 2:
        Banco itau = new Banco();
        itau.abrirConta(232);        
        itau.abrirConta(-1);        
        itau.abrirConta(24);        
        itau.abrirConta(27);        
        itau.abrirConta(28);        
        itau.abrirConta(29);        
        itau.abrirConta(20);        
        itau.abrirConta(21);        
        itau.abrirConta(22);        
        itau.abrirConta(222);        
        itau.abrirConta(222);        
        itau.abrirConta(222);        

        itau.saldo(2);
        itau.transacao(2, -53);
        itau.saldo(2);
        itau.transacao(2, 3);
        itau.saldo(2);

        itau.saldo(1);
        itau.saldo(2);
        itau.saldo(3);
        itau.saldo(4);
        itau.saldo(5);
        itau.saldo(6);
        itau.saldo(8);
        itau.saldo(9);
        itau.saldo(7);
        itau.saldo(10);
        itau.saldo(11);
        itau.saldo(-3);
    }   
}