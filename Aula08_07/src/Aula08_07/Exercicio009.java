package Aula08_07;

import java.util.Scanner;

public class Exercicio009 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float temperatura;
		
		System.out.println("---Conversor de Fahrenheit para Celsius---");
		System.out.println("Digite a temperatura atual em Fahrenheit: ");
		temperatura = entrada.nextFloat();

		float celsius = ((temperatura - 32)/9)*5;
		
		
		System.out.printf("A temperatura atual em Celsius é de: %.2f",celsius);
		
	}

}
