package PacoteJava;

/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE) */

import java.util.Scanner;

public class TotalIdades {
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		int idade, menor21=0, maior50=0;
		
		System.out.printf("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		
		while(idade!=-99)
		{
			if (idade<=21)
			{
				menor21 = menor21 + 1;
			}
			if (idade>=50)
			{
				maior50 = maior50 + 1;
			}
			System.out.printf("Entre com a sua idade: ");
			idade = leia.nextInt();
		}
		System.out.printf("Total de pessoas com menos de 21 anos: " + menor21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: " + maior50);
	
	}
}

