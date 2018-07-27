public class Treino {

	public static void main(String[] args) {
		
		boolean isCobradorPessoa = (args[0].equals("P"));
		boolean isGoleiroPessoa  = (args[1].equals("P"));
		System.out.println(isCobradorPessoa);
		System.out.println(isGoleiroPessoa);

		CobradorStrategy cobrador;
		if(isCobradorPessoa) cobrador = new CobradorPessoa("Saul");
		else				 cobrador = new CobradorBot();

		GoleiroStrategy goleiro;
		if(isGoleiroPessoa) goleiro = new GoleiroPessoa("Paulo");
		else 				goleiro = new GoleiroBot();

		Penalty p = new Penalty(goleiro, cobrador);
		
		int acertosCobrador = 0;
		int defesas = 0;
		
		for (int i = 0; i < 3; i++)
			if (p.cobrar())
				acertosCobrador++;
			else
				defesas++;
			
		System.out.println("[" + ((Jogador) cobrador).getNome() + "] Gols = " + acertosCobrador 
						+ "  [" + ((Jogador) goleiro).getNome() + "] Defesas = " + defesas);
	}

}