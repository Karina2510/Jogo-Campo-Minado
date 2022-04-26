package generics;

public class CaixaIntTeste {
	
	public static void main(String[] args) {
		
		
		// já foi instanciado o tipo integer na herança
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(123);
		
		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}

}
