package exercicios_23_ao_30;

import java.util.Scanner;

public class exercicio26 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira 3 numero inteiros: ");
		int num1 = dados.nextInt();
		int num2 = dados.nextInt();
		int num3 = dados.nextInt();

		int cont = 0;

		if (num1 < 0) {
			System.out.println("Numero negativo: " + num1);
			cont++;
		}
		if (num2 < 0) {
			System.out.println("Numero negativo: " + num2);
			cont++;
		}
		if (num3 < 0) {
			System.out.println("Numero negativo: " + num3);
			cont++;
		}
		System.out.println("Quantidade de numeros negativos nessa lista: " + cont);

		dados.close();
	}

}
