package generics;

import java.util.List;

public class ListaUtil {
	
	
	public static Object getUltimo1(List<?> lista) { //para não definir se é string, ou object, coloca o ?
		return lista.get(lista.size() - 1); //para pegar o último elemento da lista
	}
	
	public static <T> T getUltimo2(List<T> lista) { 
		return lista.get(lista.size() - 1); 
	}
	
	public static <A, B, C> C teste(A paramA, B paramB) { // pode ter mais de um parametro de tipo generico
		C teste = null;
		return teste;
	}
}
