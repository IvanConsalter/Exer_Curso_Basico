/**
 * FAÇA UM PROGRAMA QUE PEÇA O TAMANHO DE UM ARQUIVO PARA DOWNLOAD(EM MB)
 * E A VELOCIDADE DE UM LINK DE INTERNET (EM MBPS), CALCULE E INFORME O TEMPO
 * APROXIMADO DE DOWNLOAD DO ARQUIVO USANDO ESTE LINK(EM MINUTOS).
 */
package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.print("Entre com o tamanho do arquivo(Mb): ");
		double tamanhoArquivo = sc.nextDouble();
		System.out.print("Entre com a velocidade(Mb/s): ");
		double velocidade = sc.nextDouble();
		
		double tempo = (tamanhoArquivo/velocidade)/60;
		
		System.out.println("Tempo de Download(minutos): " + df.format(tempo));
		sc.close();
	}

}
