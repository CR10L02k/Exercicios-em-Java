/*2)	Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e
 *  escrever a �rea do ret�ngulo.
 *  
 * */

package exerc_resp_alg_mar2007;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		try  (Scanner scn = new Scanner(System.in)) {
				
		float base, altura, resu;
		
		System.out.print("\n - Informe a base do retángulo em metros: ");
		base = scn.nextFloat();
		
		System.out.print("\n - Informe a altura do retángulo metros: ");
		altura = scn.nextFloat(); resu = (base * altura);
		
		System.out.format("\n - A área do retángulo é %.2f m²", resu);
	}
		}
			}
