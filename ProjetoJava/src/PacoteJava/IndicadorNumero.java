package PacoteJava;

import java.util.Scanner;

//1-Faça um programa que receba três inteiros e diga qual deles é o maior.

public class IndicadorNumero {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int numero1 , numero2 , numero3;
		
		System.out.printf("Insira o primeiro número: ");
		numero1 = ler.nextInt();
		
		System.out.printf("Insira o segundo número: ");
		numero2 = ler.nextInt();
		
		System.out.printf("Insira o terceiro número: ");
		numero3 = ler.nextInt();
		
		if (numero1 > numero2)
		{
			if (numero1 > numero3)
			{
				System.out.printf("O maior número é o: %d" , numero1);
			}
			else 
			{
				System.out.printf("O maior número é o: %d" , numero3);
			}
		}
		else 
		{
			if (numero2 > numero3)
			{
				System.out.printf("O maior número é o: %d" , numero2);
			}
			else
			{
				System.out.printf("O maior número é o: %d" , numero3);
			}
		}
	}
}
