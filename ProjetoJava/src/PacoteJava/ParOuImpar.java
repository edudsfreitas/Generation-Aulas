package PacoteJava;

//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		int x, par=0, num, impar=0;
		
		for(x=1;x<=10;x++)
		{	
			System.out.printf("Insira o n�mero: ");
			num = leia.nextInt();
						
			if (num%2==0)
			{
				par = par + 1;				
			}
			else
			{
				impar = impar + 1;
			}
			
		}
		
		System.out.printf("\nPares: " + par);
		System.out.printf("\n�mpares: " + impar);
		//System.out.printf("\n�mpares: " + (10-par));
	
	}
}