/*5)	Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de
 *  reajuste. Calcular e escrever o valor do novo sal�rio.
 *  */

	package exerc_resp_alg_mar2007;
	
	import java.util.Scanner;
	
	public class Exercicio5 {
		
	static float salario, reajuste, resu;
	
	public static void main(String[] args) {

	try (Scanner scn = new Scanner (System.in)) {
	
		System.out.print("\n - Informe o Sal�rio: ");
		salario = scn.nextFloat();

		System.out.print("\n - Informe o valor do reajuste : ");
		reajuste = scn.nextFloat();
	
		resu = ((reajuste* salario) / (100)) + salario;
		
		System.out.format("\n - O novo sal�rio passou a ser %.2f R$\n ap�s reajuste de %.0f porcento.",resu, reajuste);
		
	}	}	}
