package estrutura;

import java.util.ArrayList;
import objetos.Eletronico;

public class PilhaGenericaEletronicos<T extends Eletronico> extends PilhaGenerica<T>{
	public PilhaGenericaEletronicos(int tamanhoMax) {
		super(tamanhoMax);
	}
}
