package exercicios_31_ao_36;

import java.util.Scanner;

public class exercicio32 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		double price = 0;

		System.out.println("Insira o valor pago no produto: ");
		double value = dados.nextDouble();

		if (value < 10.00) {
			price = value * 1.70;

		} else if (value >= 10.00 && value < 30.00) {
			price = value * 1.50;

		} else if (value >= 30.00 && value < 50.00) {
			price = value * 1.40;

		} else if (value >= 50.00) {
			price = value * 1.30;
		}

		System.out.printf("Valor para Venda: R$ %.2f", price);
		dados.close();
	}

}
