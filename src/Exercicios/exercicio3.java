package Exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira sua idade: ");
		int idade = dados.nextInt();

		if (idade <= 7) {
			System.out.println("Sua categoria é infantil.");
		} else if (idade > 7 && idade <= 10) {
			System.out.println("Sua categoria é juvenil.");
		} else if (idade > 10 && idade <= 15) {
			System.out.println("Sua categoria é adolescente.");
		} else if (idade > 15 && idade <= 30) {
			System.out.println("Sua categoria é adulto.");
		} else if (idade > 30) {
			System.out.println("Sua categoria é sênior.");
		}

		dados.close();
	}

}
