package PacoteJava;

/* 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 * Menor	Meio	Maior
 * 1		2		3/
 * 1		3		2/
 * 2		1		3/
 * 2		3		1/
 * 3		1		2/
 * 3		2		1
 */

import java.util.Scanner;



public class OrdenarNumeros {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Insira o primeiro n�mero: ");
		num1 = ler.nextInt();
		
		System.out.println("Insira o segundo n�mero: ");
		num2 = ler.nextInt();
		
		System.out.println("Insira o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if (num1 <= num2 && num2 <= num3)
		{
			System.out.println(num1 + ", " + num2 + ", " + num3);
		}
		else if(num1<= num3 && num3 <= num3)
		{
			System.out.println(num1 + ", " + num3 + ", " + num2);
		}
		else if(num2<= num1 && num1 <= num3)
		{
			System.out.println(num2 + ", " + num1 + ", " + num3);
		}
		else if(num2<= num3 && num3 <= num1)
		{
			System.out.println(num2 + ", " + num3 + ", " + num1);
		}
		else if(num3<= num1 && num1 <= num2)
		{
			System.out.println(num3 + ", " + num1 + ", " + num2);
		}
		else if(num3<= num2 && num2 <= num1)
		{
			System.out.println(num3 + ", " + num2 + ", " + num1);
		}
	}
	
}
