package exercicios_1_ao_10;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor: ");
			int num1 = dados.nextInt();
			
		System.out.println("Insira o segundo valor: ");
			int num2 = dados.nextInt();
	
		if(num1 > num2) {
			System.out.println("o primeiro numero é maior que o segundo!!");
		} else {
			System.out.println("o segundo numero é maior que o primeiro!!");
		}
	
	}

}
