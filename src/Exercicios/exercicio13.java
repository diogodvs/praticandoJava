package Exercicios;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		System.out.println("Insira o seu sexo, sendo 1 para masculino, e 2 para feminino: ");
			int sexo = dados.nextInt();
		
		System.out.println("Insira sua altura: ");
			double alt = dados.nextDouble();
		
		if (sexo == 1 ) {
			double pesoIdeal = (72.7 * alt) - 58;
			System.out.printf("Seu peso ideal é: %.2f Kg", pesoIdeal);
		}else if (sexo == 2) {
			double pesoIdeal = (62.1 * alt) - 44.7;
			System.out.printf("Seu peso ideal é: %.2f Kg", pesoIdeal);
		}
		
		
		
	dados.close();}

}
