package PacoteJava;

/* 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */

import java.util.Scanner;

public class SomaNumerosDigitados {
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		int numero, soma=0;
		
		do 
		{
			System.out.printf("Insira um número: ");
			numero = leia.nextInt();
			soma = soma + numero;
									
		}while(numero!=0);
		System.out.printf("Total: "+ soma);
	}
}
