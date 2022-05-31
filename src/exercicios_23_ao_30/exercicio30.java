package exercicios_23_ao_30;

import java.util.Scanner;

//Um comerciante comprou um produto e quer vendê-lo com um lucro de 45%se o valor
//da compra for menor que R$ 20,00;caso contrário,o lucro será de 30%.Desenvolva 
//		um programa que dado o valor do produto,imprimir o valor de venda.

public class exercicio30 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		double price;

		System.out.println("Insira o valor pago no produto: ");
		double value = dados.nextDouble();

		if (value < 20.00) {
			price = value + (value * 0.45);

		} else {
			price = value + (value * 0.30);
		}
		
		System.out.println();
		System.out.printf("Valor de para venda: R$ %.2f ", price);
		
		dados.close();
	}

}
