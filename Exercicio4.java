package lpaExrepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, fatorial=1, soma=1;

		System.out.println("Informe um número inteiro ");
		n = ler.nextInt();
		

		for(int i=1; i<=n ; i++) {
		fatorial = fatorial*i;
		soma*=i;
		
		}
		System.out.println(" O fatorial de " + n + " é :" + fatorial );
		
		ler.close();

	}
}
