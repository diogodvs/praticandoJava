package exercicios_11_ao_18;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		double area = 0;

		System.out.println("Quantos lados tem a figura geometrica? ");
		int quantlados = dados.nextInt();

		if (quantlados == 3) {
			System.out.println("Insira o valor da base do triangulo: ");
			double base = dados.nextDouble();

			System.out.println("Insira o valor da altura do triangulo: ");
			double altura = dados.nextDouble();

			area = (base * altura) / 2;

			System.out.println("A area do triangulo é: " + area );
			
		} else if (quantlados == 4) {
			System.out.println("Insira o valor de um do lado do quadrado: ");
			double lado = dados.nextDouble();

			area = lado * lado;

			System.out.println("A area do quadrado é: " + area);

		} else if(quantlados < 3) {
			System.out.println("A figura geometrica não é um POLIGONO!!");
			
		} else if(quantlados == 5) {
			System.out.println("A figura geometrica é um PENTAGONO!!");
		
		} else if(quantlados > 5) {
			System.out.println("POLIGONO não identificado!!");
		}
		

		dados.close();
	}

}
