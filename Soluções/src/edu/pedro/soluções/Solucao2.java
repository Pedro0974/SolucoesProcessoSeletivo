package edu.pedro.soluções;

import java.util.Scanner;

public class Solucao2 {

	public static void main(String[] args) {
		/*
		 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
		 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
		 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
		 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
		 * avisando se o número informado pertence ou não a sequência.
		 * 
		 * 
		 * 
		 * IMPORTANTE:
		 * 
		 * Esse número pode ser informado através de qualquer entrada de sua preferência
		 * ou pode ser previamente definido no código;
		 */

		// Cria um objeto da classe Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuário que informe um número inteiro positivo
		System.out.print("Digite um número inteiro positivo: ");
		int num = scanner.nextInt();

		// Calcula a sequência de Fibonacci até o número fornecido pelo usuário
		int a = 0, b = 1, c = 0;
		while (c < num) {
			c = a + b;
			a = b;
			b = c;
		}

		// Verifica se o número fornecido pelo usuário pertence à sequência de Fibonacci
		if (c == num) {
			System.out.println(num + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println(num + " não pertence à sequência de Fibonacci.");
		}

	}

}
