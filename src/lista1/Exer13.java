/**
 * FA�A UM PROGRAMA QUE PERGUNTE QUANTO VOC� GANHA POR HORA E O 
 * N�MERO DE HORAS TRABALHADAS NO M�S. CALCULE E MOSTRE O TOTAL DO SEU
 * S�LARIO NO M�S, SABENDO-SE QUE S�O DESCONTADOS:
 * 
 * 11% PARA O IMPOSTO DE RENDA
 * 8% PARA O INSS
 * 5% PARA O SINDICATO
 * 
 * FA�A UM PROGRAMA QUE NO D�:
 * 
 * A) QUANTO PAGOU AO INSS
 * B) QUANTO PAGOU AO SINDICATO
 * C) O S�LARIO L�QUIDO
 * D) CALCULE OS DESCONTOS E O SAL�RIO L�QUIDO, CONFORME A TABELA ABAIXO:
 * 
 *  SAL�RIO BRUTO - IR - INSS - SINDICATO = SAL�RIO L�QUIDO
 */
package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.print("Valor da Hora R$: ");
		double valorHora = sc.nextDouble();
		System.out.print("Horas Trabalhadas: ");
		double horasTrabalhadas = sc.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		double impostoRenda = (salarioBruto*11)/100;
		double sindicato = (salarioBruto*5)/100;
		double inss = (salarioBruto*8)/100;
		double salarioLiquido = salarioBruto - impostoRenda - sindicato - inss;
		
		System.out.println("Sal�rio bruto: " + df.format(salarioBruto));
		System.out.println("Pagou ao INSS: " + df.format(inss));
		System.out.println("Pagou de Sindicato: " + df.format(sindicato));
		System.out.println("Pagou de Imposto de Renda: " + df.format(impostoRenda));
		System.out.println("Salario Liquido: " + df.format(salarioLiquido) );

		sc.close();

	}

}
