/**
 * FA�A UM PROGRAMA QUE PE�A DOIS N�MEROS E IMPRIMA A SOMA
 */
package lista1;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com primeiro n�mero: ");
		int num1 = sc.nextInt();
		System.out.print("Entre com segundo n�mero: ");
		int num2 = sc.nextInt();
		
		//System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		
		int soma = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + (soma));
		
		sc.close();

	}

}
