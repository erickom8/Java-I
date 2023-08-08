package Aula08_07;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num1;
		int num2;
		int num3;
		System.out.print("Digite um número: ");
		num1 = entrada.nextInt();
		System.out.print("Digite outro número: ");
		num2 = entrada.nextInt();
		System.out.print("Digite outro número: ");
		num3 = entrada.nextInt();
		int soma = num1 + num2 + num3;
		float media = soma / 3;
	
		System.out.print("A média entre " + num1);
		System.out.print(" e "+num2);
		System.out.print(" e "+num3);
		System.out.printf(" é igual a: %.2f ",media);

	}

}
