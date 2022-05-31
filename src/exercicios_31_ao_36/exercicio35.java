package exercicios_31_ao_36;

import java.util.Scanner;

public class exercicio35 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		double price = 0;

		System.out.println("Insira o valor do custo de fabrica do veiculo: ");
		double value = dados.nextDouble();

		if (value <= 12000.00) {
			price = value * 1.05;

		} else if (value <= 25000.00) {
			price = value + (value * 0.10) + (value * 0.15);

		} else {
			price = value + (value * 0.15) + (value * 0.20);

		}

		System.out.printf("Valor para venda ao consumidor: R$ %.2f", price);

		dados.close();
	}

}
