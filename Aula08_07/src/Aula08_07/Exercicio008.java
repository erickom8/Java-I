package Aula08_07;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float distancia;
		float dias;
		
		
		System.out.println("---Calculando o custo de seu carro alugado!---");

		System.out.println("Quantos quilômetros você percorreu? ");
		distancia = entrada.nextFloat();
		System.out.println("Por quantos dias?  ");
		dias = entrada.nextFloat();
		
		float precofinal = (float) (distancia*(0.15)) + dias * 60;	
		
		
		System.out.printf("O preço final de sua viagem foi de R$%.2f",precofinal);

		
	}

}
