/**
 * FAÇA UM PROGRAMA QUE PEÇA DOIS NÚMEROS E IMPRIMA A SOMA
 */
package lista1;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com primeiro número: ");
		int num1 = sc.nextInt();
		System.out.print("Entre com segundo número: ");
		int num2 = sc.nextInt();
		
		//System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		
		int soma = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + (soma));
		
		sc.close();

	}

}
