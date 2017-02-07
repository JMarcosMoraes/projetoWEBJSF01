package br.com.josemarcos.service;

import java.util.Scanner;

public class servicoImpressao {

	public static void main(String[] args) {
		losango();
	}

	public void montaDiamante() {
		int numero, espacos, asteriscos;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira um número ímpar: ");
		numero = entrada.nextInt();

		if (numero % 2 != 0) {

			// Imprimindo a parte de cima do diamante
			asteriscos = 1;
			espacos = (numero - 1) / 2;
			for (int linha = 1; espacos > 0; linha++) {

				// Espaços
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

				// Espaços
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
			System.out.println("Não é ímpar!");
		}

	}

	public static void losango() {

		// TODO Auto-generated method stub

		// comprimento do lado
		int lados = 5;

		// Funcionais
		int i = 0, j = 0;
		String linha;

		for (i = 0; i < lados; i++) {
			linha = "#";
			for (j = 0; j < i; j++) {
				linha = "###" + linha + "###";
			}
			for (j = 0; j < lados - i; j++) {
				linha = "::::::" + linha + "::::::";
				System.out.println(linha);
			}
			//System.out.println(linha);
		}
		for (i = lados - 2; i >= 0; i--) {
			linha = "#";
			for (j = 0; j < i; j++) {
				linha = "###" + linha + "###";
			}
			for (j = 0; j < lados - i; j++) {
				linha = "::::::" + linha + "::::::";
			}
			System.out.println(linha);
		}
	}
}
