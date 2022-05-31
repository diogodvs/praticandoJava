package exercicios_1_ao_10;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Insira sua senha numerica de 4 digitos: ");
			int senha = dados.nextInt();
		
		int senhavalida = 1234;	
	
		if(senhavalida == senha) {
			System.out.println("ACESSO PERMITIDO!!");
		} else {
			System.out.println("ACESSO NEGADO");
		}
		
dados.close();	}

}
