package br.senac.am;

import java.util.Iterator;

public class ExemploFor {
	protected static String aluno;

	public ExemploFor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println(aluno);

		imprimirNumeros();
		imprimirParesComFor();
		imprimirParesComWhile();
		System.out.println(aluno);

	}
	
	private static void imprimirParesComWhile() {
		// TODO Auto-generated method stub
		int contadorPar = 0;
		while(contadorPar <= 21) {
			System.out.println("Número par: " + contadorPar);
			contadorPar =contadorPar+2;
		}
	}

	private static void imprimirNumeros() {
		// Imprimir números pares de 1 a 9
		aluno = "Igor";
		for(int i = 1; i <=9; i ++) {
			System.out.println("Numero: "+i);
		}
		System.out.println("fim de loop");
	}

	private static void imprimirParesComFor() {
		// Imprimir números pares de 0 a 21
		for(int i = 0; i <=21; i=i+2) {
			System.out.println("Numero: "+i);
		}
		System.out.println("fim de loop");
	}

}
