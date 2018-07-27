import java.util.Random;

public class GoleiroBot extends Jogador implements GoleiroStrategy{

    private Random randomSeed;

	public GoleiroBot() {
		super("Bot de Defesa");
        randomSeed = new Random();
	}

    @Override
	public int defender() {
        int defesa = randomSeed.nextInt(3)+1;
		System.out.println(this.getNome() + " escolheu para onde defender");
		return defesa;
	}

}