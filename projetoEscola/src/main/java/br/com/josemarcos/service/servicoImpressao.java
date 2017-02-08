package br.com.josemarcos.service;

import java.util.Scanner;

public class servicoImpressao {

	public static void main(String[] args) {
		losango();
		losango2(); 
	}

	public void montaDiamante() {
		int numero, espacos, asteriscos;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira um nÃºmero Ã­mpar: ");
		numero = entrada.nextInt();

		if (numero % 2 != 0) {

			// Imprimindo a parte de cima do diamante
			asteriscos = 1;
			espacos = (numero - 1) / 2;
			for (int linha = 1; espacos > 0; linha++) {

				// EspaÃ§os
				for (int count = 1; count <= espacos; count++) {
					System.out.print(":");
				}

				// Asteriscos
				for (int count = 1; count <= asteriscos; count++) {
					System.out.print("***");
				}

				espacos--;
				asteriscos += 2;
				System.out.println();
			}

			// Imprimindo a parte de baixo do diamante
			for (int linha = 1; asteriscos > 0; linha++) {

				// EspaÃ§os
				for (int count = 1; count <= espacos; count++) {
					System.out.print(":");
				}

				// Asteriscos
				for (int count = 1; count <= asteriscos; count++) {
					System.out.print("***");
				}

				espacos++;
				asteriscos -= 2;
				System.out.println();
			}

		} else {
			System.out.println("NÃ£o Ã© Ã­mpar!");
		}

	}

	public static void losango() {

		 for (int i = 1; i < 10; i += 2) {
		      for (int j = 0; j < 9 - i / 2; j++)
		        System.out.print(":");

		      for (int j = 0; j < i; j++)
		        System.out.print("*");

		      System.out.print("\n");
		    }

		    for (int i = 7; i > 0; i -= 2) {
		      for (int j = 0; j < 9 - i / 2; j++)
		        System.out.print(":");

		      for (int j = 0; j < i; j++)
		        System.out.print("*");

		      System.out.print("\n");
		    }
	}
	
	
	public static void losango2() {
		int n = 4;
		for (int i = -n; i <= n; i++) {
			for (int j = -n; j <= n; j++) {
				System.out.print(":");
			}
			for (int j = -n; j <= n; j++) {
				if (Math.abs(i) + Math.abs(j) <= n)
					System.out.print("###");
				else
					System.out.print(":::");
			}
			for (int j = -n ; j <= n; j++) {
				System.out.print(":");
			}
			System.out.println();
		}
		
	}
}
