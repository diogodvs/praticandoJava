package Exercicios;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);

		double trian[] = new double[3];
		
		for (int i = 0; i < trian.length; i++) {
			System.out.printf("Insira o %dº valor: ", i+1);
			trian[i] = dados.nextDouble();
		}
		
		if (trian[0] == trian[1] && trian[1] == trian[2]) {
			System.out.println("Triangulo EQUILATERO!!");
		} else if(trian[0] == trian[1] || trian[0] == trian[2] || trian[1] == trian[2]) {
			System.out.println("Triangulo ISÓSCELE");
		} else if(trian[0] != trian[1] && trian[0] != trian[2] && trian[1] != trian[2]) {
			System.out.println("Triangulo ESCALENO");
		}
			
		
		
	dados.close();}

}
