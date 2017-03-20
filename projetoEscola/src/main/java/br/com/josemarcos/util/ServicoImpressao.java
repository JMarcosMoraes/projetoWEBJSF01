package br.com.josemarcos.util;

import java.util.Arrays;
import java.util.List;

/**
 * Algoritmo Diamante
 * 
 * @author jmmoraes <br>
 * 
 *         Data: 09/02/2017
 * 
 */
public class ServicoImpressao {
	public static void main(String[] args) {
		List<Integer> listaLados = Arrays.asList(5, 7, 11, 13);
	//	listaLados.forEach(n -> diamante(n));
	}

	public static void diamante(int n) {
		for (int i = -n; i <= n; i++) {
			if (i % 3 == 0) {
				for (int j = 0; j <= 8; j++) {
					System.out.print(":");
				}
				for (int j = -n; j <= n; j++) {
					if (Math.abs(i) + Math.abs(j) <= n - 1) {
						System.out.print("#");
					} else {
						System.out.print(":");
					}
				}
				for (int j = 0; j <= 8; j++) {
					System.out.print(":");
				}
				System.out.println();
			}
		}
		for (int j = 0; j <= n + 31; j++) {
			System.out.print(":");
		}
		System.out.println();
		System.out.println();
	}

}
