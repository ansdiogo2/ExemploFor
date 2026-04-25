package br.senac.am;

public class MinhasFuncoes {
	protected static String estadosDoAluno;
	
	//Criar um método que definido um intervalo ele imprima pares 
	//Os numeros do intervalo
	
	public static void imprimirNumeros(int inicial, int fim) {
		for(int i = inicial; i <= fim; i++) {
			System.out.println("imprimirNumeros: Numero: " + i);
		}
		imprimirCMD("Fim do intervalo de "+inicial+" até o "+fim);
	}
	
	public static void imprimirParesComWhile() { // Public para visualizar em outra classe
		// TODO Auto-generated method stub
		int contadorPar = 0;
		while(contadorPar <= 21) {
			System.out.println("Número par: " + contadorPar);
			contadorPar =contadorPar+2;
		}
		imprimirCMD("fim de loop");
	}

	public static void imprimirNumeros() {
		// Imprimir números pares de 1 a 9
		estadosDoAluno = "Estado do Aluno Igor definido";
		for(int i = 1; i <=9; i ++) {
			System.out.println("Numero: "+i);
		}
		//System.out.println("fim de loop");
		imprimirCMD("fim de loop");
	}

	public static void imprimirParesComFor() {
		// Imprimir números pares de 0 a 21
		for(int i = 0; i <=21; i=i+2) {
			System.out.println("Numero: "+i);
		}
		//System.out.println("fim de loop");
		imprimirCMD("fim de loop");
	}
	
	private static void imprimirCMD(String texto) {
		System.out.println(texto);
	}

}
