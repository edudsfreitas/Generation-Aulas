package PacoteJava;

//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		int x, par=0, num, impar=0;
		
		for(x=1;x<=10;x++)
		{	
			System.out.printf("Insira o número: ");
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
		System.out.printf("\nÍmpares: " + impar);
		//System.out.printf("\nÍmpares: " + (10-par));
	
	}
}