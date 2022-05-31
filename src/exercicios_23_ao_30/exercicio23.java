package exercicios_23_ao_30;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);

		System.out.println("Insira um valor inteiro: ");
			int valor = dados.nextInt();
		
		int res = valor % 3;
		
		if( res != 0 ) {
			System.out.println("O valor inserido não é multiplo de 3!!");
		} else {
			System.out.println("O valor inserido é multiplo de 3!!");
		}
		
		
	dados.close();}

}
