package lpaExrepeticao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String n;

		for(int i = 1;  i <= 6;i++) {
			System.out.print("Digite seu nome:" );
			n= ler.next();
			System.out.println("Seu nome é: " + n);
		}
		

		ler.close();
	}
}



