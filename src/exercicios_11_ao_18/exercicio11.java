package exercicios_11_ao_18;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
	
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Quantas maçãs voce deseja comprar? ");
			int macas = dados.nextInt();
		
			double custot = 0;
			
		if(macas < 12) {
			custot = macas * 0.30;
			System.out.printf("O custo dessas macas será de R$ %.2f", custot);
		} else {
			custot = macas * 0.25;
			System.out.printf("O custo dessas macas será de R$ %.2f", custot);
		}



	dados.close();}

}
