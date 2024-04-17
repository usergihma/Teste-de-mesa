package lpaExrepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int func = 1;
		double salario=1;
		double totalSalarios = 0;
		
		System.out.print("Digite a quantidade de funcionários da empresa: ");
		func= ler.nextInt();


		for (int i = 1; i <= func; i++) {
			System.out.println("Digite o salário do funcionário " + i + ": ");
		salario = ler.nextInt();
			totalSalarios += salario;
		}

		double mediaSalarial = totalSalarios / func;

		System.out.println("A média salarial da empresa é: " + mediaSalarial);

		ler.close();
	}
}