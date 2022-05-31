package exercicios_1_ao_10;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		System.out.println("Quantos valores voce quer calcular? ");
		int size = dados.nextInt();

		int i = 1;

		do {

			System.out.println("Insira um valor: ");
			double valor = dados.nextDouble();

			if(valor <= 0) {
				System.out.println("Nao calculamos valores menores ou iguais a 0!!");
				break;
			}
			
			double raiz = Math.sqrt(valor);
			double quadrado = Math.pow(valor, 2);
			double cubo = Math.pow(valor, 3);

			System.out.printf("O valor inserido foi %.2f, seu quadrado é %.2f, sua raiz é %.2f e seu cubo é %.2f \n",
					valor, quadrado, raiz, cubo);

		} while (i <= size);

	dados.close();}

}
