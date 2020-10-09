package PacoteJava;

//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

import java.util.Scanner;

public class Matriz3 {
	public static void main(String args[])
	{
		int[][] matriz = new int[3][3];
		int vm10=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Matriz M[3][3]\n");
		
		for(int linha=0 ; linha<3 ; linha++) 
		{
			for(int coluna=0 ; coluna<3 ; coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: " , linha+1, coluna+1);
				matriz[linha][coluna] = entrada.nextInt();
				
				if (matriz[linha][coluna]>10)
				{
					vm10 = vm10 + 1;
				}
			}
		}
		
		System.out.println("Quantidade de valores da Matriz maiores que 10: " + vm10);
				
		
	}
}
