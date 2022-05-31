package exercicios_23_ao_30;

import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Insira um valor inteiro: ");
			int valor = dados.nextInt();
		
		int res3 = valor % 3;
		int res7 = valor % 7;
		
		if( res3 == 0 && res7 == 0) {
			System.out.println("O valor inserido é multiplo de 3 e de 7 !!");
		} else {
			System.out.println("O valor inserido não é multiplo de 3 e de 7 !!");
		}
		
		
	dados.close();}

	}


