/**
 * FAÇA UM PROGRAMA QUE CONVERTA METROS PARA CENTÍMETROS.
 */
package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor em metros: ");
		double metros = sc.nextDouble();
		
		double converterMetros = metros * 100;
		
		DecimalFormat df = new DecimalFormat("###.#");
		
		System.out.println(metros + " METROS = " + df.format(converterMetros) + " CENTÍMETROS");
		
		sc.close();

	}

}
