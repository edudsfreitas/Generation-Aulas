package PacoteJava;

import java.util.Scanner;

public class Repeticao2 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int idade;
		System.out.printf("Entre com a sua idade: ");
		idade = entrada.nextInt();
		
		while(idade>=1)
		{
			System.out.println("Sua idade: " + idade);
			if(idade>=18)
			{
				System.out.printf("Você é maior de idade.");
			}
			else
			{
				System.out.printf("Você é menor de idade.");
			}
			System.out.printf("\nEntre com a sua idade: ");
			idade = entrada.nextInt();
		}
	}

}
