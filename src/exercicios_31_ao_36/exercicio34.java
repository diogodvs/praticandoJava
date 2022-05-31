package exercicios_31_ao_36;

import java.util.Scanner;

public class exercicio34 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira sua idade: ");
		int idade = dados.nextInt();

		System.out.println("Insira seu peso: ");
		double peso = dados.nextDouble();

		if (idade >= 12) {
			if (peso >= 60) {
				System.out.println("Dosagem: 1000mg");
			} else {
				System.out.println("Dosagem: 875mg");
			}
		} else {
			if (peso >= 5.00 && peso <= 9.00) {
				System.out.println("Dosagem: 125mg");

			} else if (peso > 9.00 && peso <= 16.00) {
				System.out.println("Dosagem: 250mg");

			} else if (peso > 16.00 && peso <= 24.00) {
				System.out.println("Dosagem: 375mg");

			} else if (peso > 24.00 && peso <= 30.00) {
				System.out.println("Dosagem: 500mg");

			} else if (peso > 30) {
				System.out.println("Dosagem: 750mg");

			}
		}

		dados.close();
	}

}
