package PacoteJava;

import java.util.Scanner;

public class Repeticao3 {
	public static void main(String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int idade;
		
		
		do
		{
			System.out.printf("\nEntre com a sua idade: ");
			idade = entrada.nextInt();
			System.out.println("Sua idade: " + idade);
			if(idade>=18)
			{
				System.out.printf("Voc� � maior de idade.");
			}
			else
			{
				System.out.printf("Voc� � menor de idade.");
			}
		}while(idade>=1);
	}

}
