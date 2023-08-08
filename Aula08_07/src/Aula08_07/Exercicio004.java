package Aula08_07;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int dias;
		int horas;
		int minutos;
		int segundos;
		System.out.println("-Contador de tempo-");
		System.out.print("Digite a quantidade de dias: ");
		dias = entrada.nextInt();
		System.out.print("Digite a quantidade de horas: ");
		horas = entrada.nextInt();
		System.out.print("Digite a quantidade de minutos: ");
		minutos = entrada.nextInt();
		System.out.print("Digite a quantidade de segundos: ");
		segundos = entrada.nextInt();
		
		int tempo = (dias*86400) + (horas*3600) + (minutos*60) + segundos;
		System.out.print("O total de segundos é de: " + tempo);
		
	}

}
