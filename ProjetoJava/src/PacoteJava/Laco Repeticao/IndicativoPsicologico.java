package PacoteJava;

import java.util.Scanner;

public class IndicativoPsicologico {
	public static void main(String args[])
	{
		int idade,genero,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,hab=1;
		Scanner ler = new Scanner(System.in);
		while(hab<=2)
		{
			System.out.println("Entre com a sua idade: ");
			idade = ler.nextInt();
			while(idade<0 || idade>140)
			{
				System.out.println("Dado inválido! Entre com a sua idade: ");
				idade = ler.nextInt();
			}
			System.out.println("Entre com seu gênero: 1- Feminino 2- Masculino 3- Outros");
			genero = ler.nextInt();
			while(genero<1 || genero>3)
			{
				System.out.println("Dado inválido! Entre com seu gênero: 1- Feminino	2- Masculino 3- Outros");
				genero = ler.nextInt();
			}
			System.out.println("Entre com seu fator psicológico: 1- Calmo(a) 2-Nervoso(a) 3- Agressivo(a)");
			fp = ler.nextInt();
			while(fp<1 || fp>3)
			{
				System.out.println("Dado inválido! Entre com seu fator psicológico: 1- Calmo(a) 2-Nervoso(a) 3- Agressivo(a)");
				fp = ler.nextInt();
			}
			
			if(fp==1)
			{
				contpc++;
			}
			if(genero==1 && fp==2)
			{
				contmn++;
			}
			if(genero==2 && fp==3)
			{
				contha++;		
			}
			if(genero==3 && fp==1)
			{
				contoc++;
			}
			if(fp==2 && idade >40)
			{
				contpn40++;
			}
			if(fp==1 && idade<18)
			{
				contpc18++;
			}
			hab++;
		}
		
		System.out.printf("Pessoas calmas: %d" , contpc);
		System.out.printf("\nMulheres nervosas: %d" , contmn);
		System.out.printf("\nHomens Agressivos: %d" , contha);
		System.out.printf("\nOutros calmos: %d" , contoc);
		System.out.printf("\nAcima de 40 nervosos: %d" , contpn40);
		System.out.printf("\nMenores de 18 calmos: %d" , contpc18);
	}
}
