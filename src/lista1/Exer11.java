/**
 * FA�A UM PROGRAMA QUE PE�A 2 N�MEROS INTEIROS E UM N�MERO REAL.
 * CALCULE E MOSTRE:
 * A) O PRODUTO DO DOBRO DO PRIMEIRO COM METADE DO SEGUNDO.
 * B) A SOMA DO TRIPLO DO PRIMEIRO COM O TERCEIRO.
 * C) O TERCEIRO ELEVADO AO CUBO. 
 */
package lista1;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Primeiro n�mero:");
		int num1 = sc.nextInt();
		System.out.print("Segundo n�mero:");
		int num2 = sc.nextInt();
		System.out.print("N�mero Real:");
		double numReal = sc.nextDouble();
		
		double respostaA = (2*num1)*(num2/2);
		double respostaB = (3*num1)+numReal;
		double respostaC = Math.pow(numReal, 3);
		
		System.out.println("Resposta A = " + respostaA);
		System.out.println("Resposta B = " + respostaB);
		System.out.println("Resposta C = " + respostaC);
		sc.close();

	}

}
