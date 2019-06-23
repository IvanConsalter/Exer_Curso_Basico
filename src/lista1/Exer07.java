/**
 * FAÇA UM PROGRAMA QUE CALCULE A ÁREA DE UM QUADRADO, 
 * EM SEGUIDA MOSTRE O DOBRO DESTA ÁREA.
 */
package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.#");
		
		System.out.println("Entre com o lado do quadrado: ");
		double lado = sc.nextDouble();
		
		double areaQuadrado = 2*lado;
		double resposta = 2*areaQuadrado;
		
		System.out.println("A área do quadrado é: " + df.format(areaQuadrado));
		System.out.println("O dobro da área é: " + df.format(resposta));
		sc.close();

	}

}
