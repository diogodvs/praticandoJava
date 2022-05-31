package exercicios_31_ao_36;

import java.util.Scanner;

public class exercicio36 {

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

		int extrat = (extra * 60) + minextra;
		int faltat = (falta * 60) + minfalta;

		int saldo = extrat - (2 / 3 * (faltat));

		double bonus = 0;

		if (saldo >= 2401) {
			bonus = 500.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonificação");
		} else if (saldo >= 1801 && saldo <= 2400) {
			bonus = 400.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonificação");
		} else if (saldo >= 1201 && saldo <= 1800) {
			bonus = 300.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonificação");
		} else if (saldo >= 600 && saldo <= 1200) {
			bonus = 200.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonificação");
		} else {
			bonus = 100.00;
			System.out.println("Voce ganhara R$ " + bonus + " de bonificação");
		}

		dados.close();
	}
}
