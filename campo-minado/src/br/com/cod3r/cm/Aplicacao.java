package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	private static final Integer LINHAS = 6;
	private static final Integer COLUNAS = 6;
	private static final Integer MINAS = 3;
	
	public static void main(String[] args) {
		
		
		Tabuleiro tabuleiro = new Tabuleiro(LINHAS, COLUNAS, MINAS); 
		new TabuleiroConsole(tabuleiro);
		
		
	}

}
