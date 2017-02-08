package br.com.josemarcos.service;

/**
 * Algoritmo Diamante
 * 
 * @author jmmoraes
 *
 */
public class servicoImpressao {

	public static void main(String[] args) {
		diamante();
	}

	public static void diamante() {
		int n = 13;
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
	}

}
