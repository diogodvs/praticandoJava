package exercicios_31_ao_36;

import java.util.Scanner;

//Depois da libera��o do governo para as mensalidades dos planos de sa�de,
//as pessoas come�aram a fazer pesquisas para descobrir um bom plano, n�o muito caro. 
//Um vendedor de um plano de sa�de apresentou a tabela a seguir. Desenvolva um programa 
//que dada a idade de uma pessoa, imprima o valor que ela dever� pagar.
//At� 10 anos: R$ 30,00
//Acima de 10 at� 29 anos: R$ 60,00
//Acima de 29 at� 45 anos: R$ 120,00
//Acima de 45 at� 59 anos: R$ 150,00
//Acima de 59 at� 65 anos: R$ 250,00
//Maior que 65 anos: R$ 400,00

public class exercicio31 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira sua idade: ");
		int idade = dados.nextInt();

		if (idade <= 10) {
			System.out.println("Voce pagar� : R$ 30,00");
		} else if (idade > 10 && idade <= 29) {
			System.out.println("Voce pagar� : R$ 60,00");
		} else if (idade > 29 && idade <= 45) {
			System.out.println("Voce pagar� : R$ 120,00");
		} else if (idade > 45 && idade <= 59) {
			System.out.println("Voce pagar� : R$ 150,00");
		} else if (idade > 59 && idade <= 65) {
			System.out.println("Voce pagar� : R$ 250,00");
		} else if (idade > 65) {
			System.out.println("Voce pagar� : R$ 400,00");
		}

		dados.close();
	}

}
