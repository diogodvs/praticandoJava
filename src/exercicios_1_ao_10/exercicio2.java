package exercicios_1_ao_10;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);

		System.out.println("Insira seu peso: ");
		double peso = dados.nextDouble();

		System.out.println("Insira sua Idade: ");
		int idade = dados.nextInt();

		if (idade < 20) {
			if (peso <= 60) {
				System.out.println("Seu grupo de risco �: 9");
			} else if (peso > 60 && peso <= 90) {
				System.out.println("Seu grupo de risco �: 8");
			} else if (peso > 90) {
				System.out.println("Seu grupo de risco �: 7");
			}
		} else if (idade > 20 && idade <= 50) {
			if (peso <= 60) {
				System.out.println("Seu grupo de risco �: 6");
			} else if (peso > 60 && peso <= 90) {
				System.out.println("Seu grupo de risco �: 5");
			} else if (peso > 90) {
				System.out.println("Seu grupo de risco �: 4");
			}
		} else if (idade > 50) {
			if (peso <= 60) {
				System.out.println("Seu grupo de risco �: 3");
			} else if (peso > 60 && peso <= 90) {
				System.out.println("Seu grupo de risco �: 2");
			} else if (peso > 90) {
				System.out.println("Seu grupo de risco �: 1");
			}
		}
		
		dados.close();
	}

}
