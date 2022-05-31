package exercicios_23_ao_30;

import java.util.Scanner;

public class exercicio27 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Insira o ano do seu nascimento com 4 digitos: ");
		int anonasc = dados.nextInt();
	
		int idade = 2022 - anonasc;
		
		if (idade < 16) {
			System.out.println("Voce ainda nao pode votar!!");
		} else if (idade >= 16 && idade < 18 && idade >= 65) {
			System.out.println("Voto facultativo!!");
		} else if (idade >= 18 && idade <= 64) {
			System.out.println("Voto obrigatorio!!");
		}
			
		
		dados.close();}

}
