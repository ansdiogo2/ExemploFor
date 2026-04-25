package br.senac.am;

import java.util.Iterator;

public class ExemploFor {
	//protected static String estadosDoAluno;

	public ExemploFor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println(MinhasFuncoes.estadosDoAluno);

		MinhasFuncoes.imprimirNumeros();
		MinhasFuncoes.imprimirParesComFor();
		MinhasFuncoes.imprimirParesComWhile();
		MinhasFuncoes.imprimirNumeros(0, 9);
		
		System.out.println(MinhasFuncoes.estadosDoAluno);
	}
}
