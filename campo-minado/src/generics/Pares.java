package generics;



import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


public class Pares<C extends Number, V> {

	
	private final Set<Par<C, V>> itens = new LinkedHashSet<>(); //Para garantir um crit�rio de inclus�o
	
	public void adicionar(C chave, V valor) {
		if(chave == null) return;
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		//isso aqui garante que os valores sejam substituidos 
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	
	//aqui � para verificar se algum valor � associado a estrutura
	public V getValor(C chave){
		if(chave == null) return null;
		Optional<Par<C, V>> parOpcional = itens.stream().filter(par -> chave.equals(par.getChave())).findFirst();
		
		// se nenhum valor for obtido no if acima vai cair aqui e retornar um valor nulo, por n�o ter nenhum valor associado a chave
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
}
