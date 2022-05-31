package exercicios_23_ao_30;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio29 {

// Media Final do Aluno

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		ArrayList<Double> notas = new ArrayList<Double>();

		double media, soma = 0;

		for (int i = 0; i < 3; i++) {

			System.out.printf("Insira a %dº nota: \n", (i + 1));
			notas.add(dados.nextDouble());

			soma = soma + notas.get(i);
		}

		media = soma / 3;

		System.out.println("Insira a quantidade de aulas ministradas: ");
		int aulas = dados.nextInt();

		System.out.println("Insira a quantidade faltas do aluno: ");
		int faltas = dados.nextInt();

		double porcentagemFaltas = (faltas * 100) / aulas;

		if (porcentagemFaltas > 25) {
			System.out.println("Reprovado por Falta!!");

		} else {
			if (media < 3) {
				System.out.println("Reprovado!!");
			} else if (media >= 3 && media < 7) {
				System.out.println("Recuperação!!");
			} else {
				System.out.println("Aprovado!!");
			}
		}
		dados.close();
	}

}
