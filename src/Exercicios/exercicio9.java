package Exercicios;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira o ano do seu nascimento com 4 digitos: ");
			int anonasc = dados.nextInt();
		
			int idade = 2022 - anonasc;
		if(idade >= 16) {
			System.out.println("Voce pode votar esse ano!!");
		} else {
			System.out.println("Voce ainda nao pode votar!!");
		}
		
	}

}
