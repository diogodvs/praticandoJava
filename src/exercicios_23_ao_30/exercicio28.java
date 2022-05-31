package exercicios_23_ao_30;

import java.util.Calendar;
import java.util.Scanner;

public class exercicio28 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
		Calendar gc = Calendar.getInstance();

		System.out.println("Insira o ano do seu nascimento com 4 digitos: ");
		int anonasc = dados.nextInt();

		System.out.println("Insira o mes do seu nascimento em numeral: ");
		int mesnasc = dados.nextInt();

		System.out.println("Insira o dia do seu nascimento: ");
		int dianasc = dados.nextInt();

		int idade = gc.get(Calendar.YEAR) - anonasc;

		if (mesnasc <= gc.get(Calendar.MONTH)) {
			if (dianasc >= gc.get(Calendar.DATE)) {
				System.out.println("Voce tem " + idade + " anos.");
			} else {
				
				System.out.println("Voce tem " + (idade - 1) + " anos.");

			}
		} else {
			System.out.println("Voce tem " + (idade - 1) + " anos.");
		}

		dados.close();
	}

}
