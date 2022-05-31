package exercicios_1_ao_10;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		double salarioC, salarioJ;
		int meses = 0;

		System.out.println("Insira o valor do salario do Carlos: ");
		salarioC = dados.nextDouble();

		salarioJ = salarioC / 3;

		while (salarioJ <= salarioC) {
			salarioC = salarioC * 1.02;
			salarioJ = salarioJ * 1.05;

			meses++;
		}

		System.out.println("O valor investido pelo Joao se iguala ou ultrapassa o de carlos com " + meses + " meses");

		dados.close();
	}

}
