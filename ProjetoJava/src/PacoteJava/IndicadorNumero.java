package PacoteJava;

import java.util.Scanner;

//1-Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class IndicadorNumero {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int numero1 , numero2 , numero3;
		
		System.out.printf("Insira o primeiro n�mero: ");
		numero1 = ler.nextInt();
		
		System.out.printf("Insira o segundo n�mero: ");
		numero2 = ler.nextInt();
		
		System.out.printf("Insira o terceiro n�mero: ");
		numero3 = ler.nextInt();
		
		if (numero1 > numero2)
		{
			if (numero1 > numero3)
			{
				System.out.printf("O maior n�mero � o: %d" , numero1);
			}
			else 
			{
				System.out.printf("O maior n�mero � o: %d" , numero3);
			}
		}
		else 
		{
			if (numero2 > numero3)
			{
				System.out.printf("O maior n�mero � o: %d" , numero2);
			}
			else
			{
				System.out.printf("O maior n�mero � o: %d" , numero3);
			}
		}
	}
}
