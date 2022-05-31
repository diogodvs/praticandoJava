package exercicios_11_ao_18;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		double angulos[] = new double[3];

		for (int i = 0; i < angulos.length; i++) {
			System.out.printf("Insira o %dº valor: ", i + 1);
			angulos[i] = dados.nextDouble();
		}

		
		
		if (angulos[0] == 90 || angulos[1] == 90 || angulos[2] == 90) {
			System.out.println("TRIANGULO RETANGULO");
		} else if (angulos[0] > 90 || angulos[1] > 90 || angulos[2] > 90) {
			System.out.println("TRIANGULO OBTUSÂNGULO");
		} else if (angulos[0] < 90 || angulos[1] < 90 || angulos[2] < 90) {
			System.out.println("TRIANGULO ACUNTÂNGULO");
		}

	dados.close();}

}
