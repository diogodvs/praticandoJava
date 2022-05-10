package Exercicios;

import java.util.Scanner;

// salario minimo 450,00
// valor da hora trabalhada 2,34

public class exercicio5 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira sua categoria sendo G para gerente e O para operario: ");
		String categoria = dados.nextLine();
		
		try {
			while(categoria == "G") {
				System.out.println("Insira seu turno sendo M para matutino, V para vespertino e N para noturno: ");
				String turno = dados.nextLine();

			
		} }catch (Exception e) {
			System.out.println(e);
		
		
		}
		
		
		
		while(categoria == "O") {
			System.out.println("Insira seu turno sendo M para matutino, V para vespertino e N para noturno: ");
			String turno = dados.nextLine();

			
		}
		
	}
}
