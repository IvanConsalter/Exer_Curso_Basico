/**
 * FAÇA UM PROGRAMA QUE PEÇA UM NÚMERO E ENTÃO MOSTRE A MENSAGEM
 * "O NÚMERO INFORMADO FOI [NÚMERO]."
 */
package lista1;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um número: ");
		int num = sc.nextInt();
		
		System.out.println("O número informado foi : " + num);
		
		sc.close();

	}

}
