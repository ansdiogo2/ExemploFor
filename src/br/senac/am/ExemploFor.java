package br.senac.am;

import java.util.Iterator;

public class ExemploFor {

	public ExemploFor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Imprimir números pares de 1 a 9
		for(int i = 1; i <=9; i ++) {
			System.out.println("Numero: "+i);
		}
		System.out.println("fim de loop");
		
		// Imprimir números pares de 0 a 21
		for(int i = 0; i <=21; i=i+2) {
			System.out.println("Numero: "+i);
		}
		System.out.println("fim de loop");
		
		int contadorPar = 0;
		while(contadorPar <= 21) {
			System.out.println("Número par: " + contadorPar);
			contadorPar =contadorPar+2;
		}
	}

}
