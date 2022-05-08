package Exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		double salariofin;
		double ajuste;

		System.out.println("Insira seu salario bruto: ");
		double salario = dados.nextDouble();

		if (salario <= 350.00) {
			ajuste = ((salario + 100.00) * 0.07);
			salariofin = ajuste + salario + 100.00;
			System.out.printf("Seu salario liquido será: %.2f", salariofin);

		} else if (salario > 350.00 && salario <= 600.00) {
			ajuste = ((salario + 75.00) * 0.07);
			salariofin = ajuste + salario + 75.00;
			System.out.printf("Seu salario liquido será: %.2f", salariofin);

		} else if (salario > 600.00 && salario <= 900.00) {
			ajuste = ((salario + 50.00) * 0.07);
			salariofin = ajuste + salario + 50.00;
			System.out.printf("Seu salario liquido será: %.2f", salariofin);

		} else if (salario > 900.00) {
			ajuste = ((salario + 35.00) * 0.07);
			salariofin = ajuste + salario + 35.00;
			System.out.printf("Seu salario liquido será: %.2f", salariofin);
		}

		dados.close();
	}

}
