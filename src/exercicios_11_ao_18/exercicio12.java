package exercicios_11_ao_18;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira o primeiro valor: ");
		int valor1 = dados.nextInt();

		System.out.println("Insira o primeiro valor: ");
		int valor2 = dados.nextInt();

		System.out.println("Insira o primeiro valor: ");
		int valor3 = dados.nextInt();

		int maior = Math.max(valor1, Math.max(valor2, valor3));
		int menor = Math.min(valor1, Math.min(valor2, valor3));
		
		int meio = valor1;
		
		if (valor1 < maior && valor1 > menor) {
			meio = valor1;
		} else if (valor2 < maior && valor2 > menor) {
			meio = valor2;
		} else {
			meio = valor3;
		}
		
		System.out.printf("a Sequencia do maior para o menor é: %d, %d, %d.", maior, meio, menor);
	
	dados.close();}

}
