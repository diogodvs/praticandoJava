package exercicios_23_ao_30;

import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println(" --- CREDITO PARA ALUNOS STACKX ---");
		
		System.out.println("Insira o valor do seu salario: ");
			double salario = dados.nextDouble();
		
		double valorparcelamax = salario * 0.30; 	

		System.out.println("Insira o valor desejado para emprestimo: ");
			double valoremprestimo = dados.nextDouble();
		
		System.out.println("insira a quantidade de parcelas: ");
			int parcelas = dados.nextInt();
		
		double valorparcela = valoremprestimo / parcelas;
		
		if(valorparcela > valorparcelamax) {
			System.out.println("O emprestimo nao pode ser concedido!");
			System.out.println("Valor de parcela acima do maximo permitido!");
			System.out.println("Valor maximo da parcela é de: " + valorparcelamax);
			
		} else {
			System.out.println("O emprestimo pode ser concedido!!");
			System.out.println("valor requisitato: R$ " + valoremprestimo);
			System.out.println("Sera dividido em " + parcelas + " vezes.");
			System.out.println("O valor da parcelas sera de: R$ " + valorparcela);
			
			
		}
		
		
		
	dados.close();}

}
