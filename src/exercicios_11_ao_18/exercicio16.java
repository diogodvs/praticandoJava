package exercicios_11_ao_18;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		System.out.printf("Insira o 1º valor inteiro: ");
		int v1 = dados.nextInt();

		System.out.printf("Insira o 2º valor inteiro: ");
		int v2 = dados.nextInt();

		System.out.printf("Insira o 3º valor inteiro: ");
		int v3 = dados.nextInt();

		int maior = v1;
		
		if(v2 > maior) {
			maior = v2;
		}if(v3 > maior) {
			maior = v3;
		}
		
		System.out.println("O maior valor dentre os 3 inseridos é: " + maior );	
			
			
		dados.close();
	}

}
