package exercicios_31_ao_36;

import java.util.Scanner;

public class exercicio33 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		double imc, peso, altura;

		System.out.println("Insira sua altura: ");
		altura = dados.nextDouble();

		System.out.println("Insira seu peso: ");
		peso = dados.nextDouble();

		imc = peso / (Math.pow(altura, 2));

		if (imc < 20) {
			System.out.println("Grupo de risco: Abaixo do peso!!");

		} else if (imc >= 20 && imc < 25) {
			System.out.println("Grupo de risco: Normal!!");

		} else if (imc >= 25 && imc < 30) {
			System.out.println("Grupo de risco: Excesso de peso!!");

		} else if (imc >= 30 && imc < 35) {
			System.out.println("Grupo de risco: Obesidade!!");

		} else if (imc >= 35) {
			System.out.println("Grupo de risco: Obesidade Morbida!!");
		}

		dados.close();
	}

}
