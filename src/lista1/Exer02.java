/**
 * FA�A UM PROGRAMA QUE PE�A UM N�MERO E ENT�O MOSTRE A MENSAGEM
 * "O N�MERO INFORMADO FOI [N�MERO]."
 */
package lista1;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero: ");
		int num = sc.nextInt();
		
		System.out.println("O n�mero informado foi : " + num);
		
		sc.close();

	}

}
