package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		
		
		//n�o recomendado - sem generics
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // t� convertendo do double primitivo para class automaticamente
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaA.guardar("Ol�"); 
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}

}
