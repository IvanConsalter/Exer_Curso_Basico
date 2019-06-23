/**
 * TENDO COMO DADOS DE ENTRADA A ALTURA DE UMA PESSOA, CONSTRUA UM
 * ALGORITMO QUE CALCULE SEU PESO IDEAL, USANDO A SEGUINTE FÓRMULA:
 * 
 * (72.7 * ALTURA) - 58
 */
package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");

		System.out.print("Entre com Altura(m): ");
		double altura = sc.nextDouble();
		
		
		double pesoIdeal = (72.7 * altura) - 58;
	
		System.out.println("Seu peso ideal é: " + df.format(pesoIdeal));
		sc.close();
		
	}

}
