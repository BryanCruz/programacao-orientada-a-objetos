import java.util.Random;

public class CobradorBot extends Jogador implements CobradorStrategy{

    private Random randomSeed;
	public CobradorBot() {
		super("Bot de Ataque");
        randomSeed = new Random();
	}

    @Override
	public int chutar() {
        int chute = randomSeed.nextInt(3)+1;
		System.out.println(this.getNome() + " escolheu para onde chutar");
		return chute;
	}
}