/* 7)	Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s,
 * mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele
 * efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de
 * suas vendas, o sal�rio fixo e o valor que ele recebe por carro vendido.Calcule e escreva o sal�rio
 * final do vendedor.
 * */

	package exerc_resp_alg_mar2007;
		
	import java.util.Scanner;
		
	public class Exercicio7 {
		
	static float salarioFixo, totalVendas, porcVendas, comissaoFixa, comissao, resu, resu2, salarioFinal;
	static String nome;
	static int carroVend;
	
	public static void main(String[] args) {
		
	try (Scanner scn = new Scanner (System.in))					{ 
		
		System.out.print("\n - Informe o nome do funcionario: ");
			nome = scn.nextLine();		
	
	do {
		
		System.out.print("\n - Informe o s�lario fixo: ");
			salarioFixo = scn.nextFloat();
		
		System.out.print("\n - Informe a quantidade de carros vendidos: ");
			carroVend = scn.nextInt();
		
		System.out.print("\n - Informe a total de vendas: ");
			totalVendas = scn.nextFloat();
		
		System.out.print("\n - Informe a o valor da comiss�o fixa: ");
			comissaoFixa = scn.nextFloat();
		
			porcVendas = (float) (totalVendas * 0.05);
			comissao = carroVend * comissaoFixa;
		
			salarioFinal = salarioFixo + porcVendas + comissao;
		
		System.out.println("\n============================================================================================================================================");		
		System.out.print("\n - M�tricas do funcion�rio: \n\n ==> "+nome+"\n");
		System.out.print("\n - N�mero de carros vendidos    	 : "+carroVend+"\n - Valor total de suas vendas	   	 : ");
		System.out.print(totalVendas+"R$\n");
		System.out.print(" - Sal�rio fixo 			 : "+salarioFixo+"R$\n - Valor da comiss�o a cada carro vendido: "+comissaoFixa+"R$\n");
		System.out.print(" - Sal�rio final do vendedor 		 : " + salarioFinal + "R$\n\n");
		System.out.println("============================================================================================================================================");		
		System.out.println("\n - Se deseja continuar digite (1) para sim e (2) para n�o. ");
			resu = scn.nextFloat(); 
		System.out.println("\n============================================================================================================================================");			
	
	if (resu == 2) {
		
	for (int i = 0; i<=50; i++) System.out.println(" ");

		System.out.println("\n - Obrigado por usar meu codigo!\n\n         - By VIEIR42k ");
	
	for (int i = 0; i<=3; i++) System.out.println(" ");
	
	}

	else 
		
		System.out.print("\n - Informe o nome do funcionario: ");
			nome = scn.next(); 		
	
	} 
	
	while (resu == 1);
	
			}	}	}	
