/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.josemarcos.service;

import java.util.Scanner;

public class servicoImpressao {

	public static void main(String[] args) {
		losango();
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
