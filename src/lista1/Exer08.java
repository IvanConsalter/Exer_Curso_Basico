/**
 * FA�A UM PROGRAMA QUE PERGUNTE QUANTO VO�� GANHA POR HORA E 
 * O N�MERO DE HORAS TRABALHADAS NO M�S. CALCULE E MOSTRE 
 * O TOTAL DO SEU S�LARIO NO REFERIDO M�S
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

		System.out.println("S�lario da m�s: " + df.format(salario));
		sc.close();

	}

}
