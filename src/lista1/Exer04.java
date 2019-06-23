/**
 * FAÇA UM PROGRAMA QUE PEÇA AS 4 NOTAS BIMESTRAIS E MOSTRE A MÉDIA.
 */
package lista1;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Entre com a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.print("Entre com a terceira nota: ");
		double nota3 = sc.nextDouble();
		System.out.print("Entre com a quarta nota: ");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("A média foi: %.1f%n" , media);
		sc.close();

	}

}
