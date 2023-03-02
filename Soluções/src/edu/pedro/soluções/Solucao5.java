package edu.pedro.soluções;

public class Solucao5 {
	/*
	 * 5) Escreva um programa que inverta os caracteres de um string.
	 * 
	 * 
	 * 
	 * IMPORTANTE:
	 * 
	 * a) Essa string pode ser informada através de qualquer entrada de sua
	 * preferência ou pode ser previamente definida no código;
	 * 
	 * b) Evite usar funções prontas, como, por exemplo, reverse;
	 */

	public static void main(String[] args) {
		String original = "Hello, world!";
		String invertida = inverteString(original);
		System.out.println(invertida); // !dlrow ,olleH
	}

	public static String inverteString(String original) {
		char[] caracteres = original.toCharArray();
		int tamanho = caracteres.length;
		for (int i = 0; i < tamanho / 2; i++) {
			char temp = caracteres[i];
			caracteres[i] = caracteres[tamanho - i - 1];
			caracteres[tamanho - i - 1] = temp;
		}
		return new String(caracteres);
	}

}
