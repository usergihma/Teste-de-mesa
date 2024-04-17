package lpaExrepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int par=0;
		int n,imp=0;

		System.out.println("Informe 10 números inteiros");
		n= ler.nextInt();
		for(int i=0; i<=10 ; i++) {
			if (i%2 != 0) {
				par++;
			}
			else {
				imp++;
			}
			System.out.println("Quantidade de números pares" + par);
			System.out.println("Quantidade de números ímpares"+ imp);
		}
		ler.close();
	}

}
