/**
 * FAÇA UM PROGRAMA QUE PEÇA A TEMPERATURA EM GRAUS CELSIUS,
 * TRANSFORME E MOSTRE EM GRAUS FARENHEIT.
 */
package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
		
		System.out.print("Entre com a temperatura em Celsius: ");
		double temperaturaCelsius = sc.nextDouble();
		
		double convertendoParaFarenheit = (9*temperaturaCelsius/5)+32;
		
		System.out.println("Temperatura em Farenheit = " + df.format(convertendoParaFarenheit));
		
		
		sc.close();

	}

}
