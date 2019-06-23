/**
 * FA�A UM PROGRAMA QUE PE�A O RAIO DE UM C�RCULO,
 * CALCULE E MOSTRE SUA �REA.
 */
package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com Raio: ");
		double raio = sc.nextDouble();
		
		double areaCirculo = Math.PI*raio*raio;
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.println("A �rea do c�rculo de Raio: " + raio + " = " + df.format(areaCirculo) + " udm�");
		sc.close();
	}

}
