/**
 * FAÇA UM PROGRAMA QUE PERGUNTE QUANTO VOCÊ GANHA POR HORA E O 
 * NÚMERO DE HORAS TRABALHADAS NO MÊS. CALCULE E MOSTRE O TOTAL DO SEU
 * SÁLARIO NO MÊS, SABENDO-SE QUE SÃO DESCONTADOS:
 * 
 * 11% PARA O IMPOSTO DE RENDA
 * 8% PARA O INSS
 * 5% PARA O SINDICATO
 * 
 * FAÇA UM PROGRAMA QUE NO DÊ:
 * 
 * A) QUANTO PAGOU AO INSS
 * B) QUANTO PAGOU AO SINDICATO
 * C) O SÁLARIO LÍQUIDO
 * D) CALCULE OS DESCONTOS E O SALÁRIO LÍQUIDO, CONFORME A TABELA ABAIXO:
 * 
 *  SALÁRIO BRUTO - IR - INSS - SINDICATO = SALÁRIO LÍQUIDO
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
		
		System.out.println("Salário bruto: " + df.format(salarioBruto));
		System.out.println("Pagou ao INSS: " + df.format(inss));
		System.out.println("Pagou de Sindicato: " + df.format(sindicato));
		System.out.println("Pagou de Imposto de Renda: " + df.format(impostoRenda));
		System.out.println("Salario Liquido: " + df.format(salarioLiquido) );

		sc.close();

	}

}
