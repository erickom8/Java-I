package Aula08_07;
import java.util.Scanner;



public class HelloWorld {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
			String Nome;
			int idade;
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Digite seu nome: ");
			Nome = entrada.nextLine();
			
		System.out.print("Você se chama ");
		System.out.print(Nome);
		System.out.print(" e tem ");
		System.out.print(idade + " anos");


		/*
		byte idade = 18;
		System.out.print("Ola mundo! Eu tenho ");
		System.out.print(idade);
		System.out.print(" anos");
		*/
	}

}


