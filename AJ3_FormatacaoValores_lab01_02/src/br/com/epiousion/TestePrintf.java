/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
package br.com.epiousion;

import java.util.Date;

public class TestePrintf {

	public static void main(String[] args) {

		// Mostre a data no formato dd/mm/yyyy
		Date data = new Date();
		System.out.printf("%1$td/%1$tm/%1$tY %n", data);

		// Mostre o numero inteiro com 6 digitos e zeros a esquerda
		int i = 101;
		System.out.printf("Inteiro = %06d %n", i);

		// Mostre o numero double com 2 casas decimais
		double numero = 23.45;
		System.out.printf("Decimal = %5.2f", numero);
	}
}
