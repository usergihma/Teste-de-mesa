package lpaExrepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n ,soma=0;
		for(int i=1; i<=5 ; i++) {
			System.out.print("Informe nota" +i + ":");
			n = ler.nextInt();
			soma=soma+n;

		}

		double media=soma/5;	
		System.out.println("A média é: " + media);
	}



}






