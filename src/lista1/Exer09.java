/**
 * FAÇA UM PROGRAMA QUE PEÇA A TEMPERATURA EM GRAUS FARENHEIT,
 * TRANSFORME E MOSTRE A TEMPERATURA EM GRAUS CELSIUS
 *  C = (5 * (F - 32) / 9)
 */
package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
		
		System.out.print("Entre com a temperatura em Farenheit: ");
		double temperaturaFarenheit = sc.nextDouble();
		
		double convertendoParaCelsius = (5 * (temperaturaFarenheit - 32) / 9);
		
		System.out.println("Temperatura em Celsius = " + df.format(convertendoParaCelsius));
		
		
		sc.close();
	}

}
