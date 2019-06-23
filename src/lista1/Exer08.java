/**
 * FAÇA UM PROGRAMA QUE PERGUNTE QUANTO VOÇÊ GANHA POR HORA E 
 * O NÚMERO DE HORAS TRABALHADAS NO MÊS. CALCULE E MOSTRE 
 * O TOTAL DO SEU SÁLARIO NO REFERIDO MÊS
 */
package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
		
		System.out.print("Valor da Hora R$: ");
		double valorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		double horasTrabalhadas = sc.nextDouble();
		
		double salario = valorHora*horasTrabalhadas;

		System.out.println("Sálario da mês: " + df.format(salario));
		sc.close();

	}

}
