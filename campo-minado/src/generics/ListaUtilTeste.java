package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	
	// tudo sem generics, por isso tem que ficar fazendo convers�es
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem1);
		
		Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero1);
		
		//aqui � usando generics
		
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		
		Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
		System.out.println(ultimoNumero2);
	}

}
