/**
 * FAÇA UM PROGRAMA QUE PEÇA O RAIO DE UM CÍRCULO,
 * CALCULE E MOSTRE SUA ÁREA.
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
		
		System.out.println("A área do círculo de Raio: " + raio + " = " + df.format(areaCirculo) + " udm²");
		sc.close();
	}

}
