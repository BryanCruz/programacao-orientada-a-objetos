package programa;
import universidade.Pessoa;

public class Principal {
    
    public static void main(String[] args){
        Pessoa brabo = new Pessoa();
        brabo.setNome("Filipi");

        Pessoa bigode = new Pessoa();
        bigode.setNome("Jonatas");

        System.out.println("aaaa: " + brabo.getNome() + " " + bigode.getNome());
    }
    
}