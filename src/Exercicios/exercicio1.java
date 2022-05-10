package Exercicios;

import java.util.Scanner;

//Uma empresa decidiu dar uma gratificação de Natal a seus funcionários, baseada no número de horas extras e no número de horas que o funcionário faltou ao trabalho. O valor do prêmio é obtido pela consulta à tabela que se segue, na qual:
//H = número de horas extras – (2/3 * ( número de horas falta ))
//
//H (MINUTOS PRÊMIO (R$)
//
//= 2.401 = 500,00 1.801 até 2.400 = 400,00 1.201 até 1.800 = 300,00 600 até 1.200 200,00 <600 = 100,00

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro de horas extras que voce trabalhou: ");
		int extra = dados.nextInt();
		
		System.out.println("Insira um numero inteiro de minutos extras que voce trabalhou: ");
		int minextra = dados.nextInt();
		
		System.out.println("Insira um numero inteiro de horas de falta: ");
		int falta = dados.nextInt();
		
		System.out.println("Insira um numero inteiro de minutos que voce faltou: ");
		int minfalta = dados.nextInt();
		
		int extrat = (extra * 60) + minextra ;
		int faltat = (falta * 60) + minfalta  ;

		int saldo = extrat - (2/3 * (faltat));
		
		double bonus = 0;
		
		if (saldo >= 2401) {
			bonus = 500.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonificação");
		} else if (saldo >= 1801 && saldo <= 2400) {
			bonus = 400.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonificação");  
		} else if (saldo >= 1201 && saldo <= 1800) {
			bonus = 300.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonificação" ); 
		} else if (saldo >= 600 && saldo <= 1200) {
			bonus = 200.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonificação"); 
		} else {
			bonus = 100.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonificação" );
		}
		
			
		
	dados.close();}

}
