package Exercicios;

import java.util.Scanner;

// salario minimo 450,00
// valor da hora trabalhada 2,34

public class exercicio5 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		int func = 1;
		double valHora = 0;
		double auxilio = 0;
		
		while (func <= 10) {

			System.out.println("Insira seu nome: ");
			String nome = dados.next();
			
			System.out.println("Insira sua categoria sendo G para gerente e O para operario: ");
				String categoria = dados.next();

			System.out.println("Insira seu turno sendo M para matutino, V para vespertino e N para noturno: ");
				String turno = dados.next();

			if(categoria == "G") {
				if(turno == "N") {
					valHora = 450.00 * 0.18;
				} else if(turno == "M" && turno == "V") {
					valHora = 450.00 * 0.15;
				}
			} else if(categoria == "O") {
					if(turno == "N") {
						valHora = 450.00 * 0.13;
					} else if(turno == "M" && turno == "V") {
						valHora = 450.00 * 0.10;
					}
				}
			System.out.println("Insira a quantidade de horas trabalhadas semanais: ");
				int horaTrabSemana = dados.nextInt();
			
			int horaTrabMes	= horaTrabSemana * 4;
			
			double salarioInicial = (horaTrabMes * valHora);
			
			if(salarioInicial <= 300.00) {
				auxilio = salarioInicial * 0.20;
			
			} else if (salarioInicial > 300.00 && salarioInicial < 600.00) {
				auxilio = salarioInicial * 0.15;
			
			} else if (salarioInicial > 600.00) {
				auxilio = salarioInicial * 0.05;
			}
		
			double salarioFinal = salarioInicial + auxilio;
			
			System.out.println(nome);
			System.out.printf("Voce trabalhou %d horas nesse mês.\n" , horaTrabMes);
			System.out.printf("O valor da sua hora trabalhada é de R$ %.2f \n", valHora);
			System.out.printf("Seu salario Inical é de R$ %.2f \n", salarioInicial);
			System.out.printf("Seu auxilio alimentação é de R$ %.2f \n", auxilio);
			System.out.printf("Seu salario final com auxilio é de R$ %.2f \n", salarioFinal);
		
		
		}
	}

}
