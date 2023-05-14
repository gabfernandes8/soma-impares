package br.senai.sp.jandira;

import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero[] = new int[6];
		int soma = 0;

		System.out.println("Bem-vindo a calculadora de números ímpares!");
		System.out.println("");
		System.out.println("Digite 6 números inteiros.");
		System.out.println("");

		for (int i = 0; i < numero.length; i++) {

			System.out.print("Número " + (i + 1) + ": ");
			numero[i] = teclado.nextInt();

			if (numero[i] % 2 != 0) {
				soma += numero[i];

			}

		}
		
		if (soma != 0) {
			System.out.println("");
			System.out.println("A soma dos números é: " + soma);
		} else {
			System.out.println("");
			System.out.println("Nenhum número que você digitou é ímpar.");
		}
		

	}
}