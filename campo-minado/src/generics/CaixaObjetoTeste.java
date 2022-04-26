package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		
		
		//não recomendado - sem generics
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // tá convertendo do double primitivo para class automaticamente
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaA.guardar("Olá"); 
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}

}
