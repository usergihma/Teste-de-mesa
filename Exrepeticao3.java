package lpaExrepeticao;

import java.util.Scanner;

public class Exrepeticao3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, resultado;

		System.out.println("Informe o número para uma tabuada: ");
		n = ler.nextInt();

		for(int i=0; i<=10 ; i++) {
			resultado= n*i;
			System.out.println(n + "x" + i + " = " +resultado);
		}

	ler.close();
}

}
