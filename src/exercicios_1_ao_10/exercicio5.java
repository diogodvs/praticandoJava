package exercicios_1_ao_10;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		int qtdfuncionarios = 10;
		int codigo = 0;
		int horaTrabMes = 0;
		char turnoTrabalho = 'X';
		char categoria = 'Y';

		double valHora = 0;

		for (int i = qtdfuncionarios; i > 0; i--) {
			
		

			System.out.print("Insira o codigo do funcionario: ");
			codigo = dados.nextInt();

			System.out.print("Insira a quantidade de horas trabalhadas no mes: ");
			horaTrabMes = dados.nextInt();

			System.out.print("Turno de trabalho sendo [ M / V / N ] : ");

			while (turnoTrabalho != 'M' && turnoTrabalho != 'V' && turnoTrabalho != 'N') {

				turnoTrabalho = dados.next().charAt(0);

				if (turnoTrabalho != 'M' && turnoTrabalho != 'V' && turnoTrabalho != 'N') {
					System.out.println();
					System.out.println("Turno Invalido!!");
					System.out.print("Insira M, V ou N: ");

				}
			}

			System.out.print(" Insira a categoria sendo [ G / O ] : ");

			while (categoria != 'G' && categoria != 'O') {

				categoria = dados.next().charAt(0);

				if (categoria != 'G' && categoria != 'O') {
					System.out.println();
					System.out.println("Categoria Invalida!!");
					System.out.print("Insira G ou O: ");
				}
			}

			if (categoria == 'G') {
				if (turnoTrabalho == 'N') {
					valHora = 450.00 * 0.18;
				} else if (turnoTrabalho == 'M' || turnoTrabalho == 'V') {
					valHora = 450.00 * 0.15;
				}
			} else if (categoria == 'O') {
				if (turnoTrabalho == 'N') {
					valHora = 450.00 * 0.13;
				} else if (turnoTrabalho == 'M' || turnoTrabalho == 'V') {
					valHora = 450.00 * 0.10;
				}
			}

			double salarioInicial = (horaTrabMes * valHora);

			double auxilio = 0;

			if (salarioInicial <= 300.00) {
				auxilio = salarioInicial * 0.20;

			} else if (salarioInicial > 300.00 && salarioInicial <= 600.00) {
				auxilio = salarioInicial * 0.15;

			} else if (salarioInicial > 600.00) {
				auxilio = salarioInicial * 0.05;
			}

			double salarioFinal = salarioInicial + auxilio;

			System.out.println("Id do funcioanrio: " + codigo);
			System.out.printf("Voce trabalhou %d horas nesse mês.\n", horaTrabMes);
			System.out.printf("O valor da sua hora trabalhada é de R$ %.2f \n", valHora);
			System.out.printf("Seu salario Inical é de R$ %.2f \n", salarioInicial);
			System.out.printf("Seu auxilio alimentação é de R$ %.2f \n", auxilio);
			System.out.printf("Seu salario final com auxilio é de R$ %.2f \n\n", salarioFinal);

			System.out.println("------------------------------------------------------------");

			/* fechamento For */ }

		dados.close();
	}
}
