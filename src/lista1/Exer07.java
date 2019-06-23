/**
 * FA�A UM PROGRAMA QUE CALCULE A �REA DE UM QUADRADO, 
 * EM SEGUIDA MOSTRE O DOBRO DESTA �REA.
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
		
		System.out.println("A �rea do quadrado �: " + df.format(areaQuadrado));
		System.out.println("O dobro da �rea �: " + df.format(resposta));
		sc.close();

	}

}
