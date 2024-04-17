package lpaExrepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;

		System.out.println("Informe um valor limite");
		n = ler.nextInt();


		for(int i=0; i<=n ; i++) {
			if (i%2 != 0){
				System.out.println(i + " É ímpar " );

			}
			else {

			}
		}


		ler.close();

	}

}
