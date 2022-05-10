package Exercicios;

import java.util.Scanner;

//Uma empresa decidiu dar uma gratifica��o de Natal a seus funcion�rios, baseada no n�mero de horas extras e no n�mero de horas que o funcion�rio faltou ao trabalho. O valor do pr�mio � obtido pela consulta � tabela que se segue, na qual:
//H = n�mero de horas extras � (2/3 * ( n�mero de horas falta ))
//
//H (MINUTOS PR�MIO (R$)
//
//= 2.401 = 500,00 1.801 at� 2.400 = 400,00 1.201 at� 1.800 = 300,00 600 at� 1.200 200,00 <600 = 100,00

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
			System.out.println("Voce ganhara R$ " + bonus + " de bonifica��o");
		} else if (saldo >= 1801 && saldo <= 2400) {
			bonus = 400.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonifica��o");  
		} else if (saldo >= 1201 && saldo <= 1800) {
			bonus = 300.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonifica��o" ); 
		} else if (saldo >= 600 && saldo <= 1200) {
			bonus = 200.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonifica��o"); 
		} else {
			bonus = 100.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonifica��o" );
		}
		
			
		
	dados.close();}

}
