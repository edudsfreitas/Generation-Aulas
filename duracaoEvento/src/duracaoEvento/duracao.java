package duracaoEvento;

/*
 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */

import java.util.Scanner;

public class duracao {public static void main(String args[])
	{
	Scanner ler = new Scanner(System.in);
	
	int totalSegundos,segundos,minutos,horas;
	
	System.out.println("Insira a dura��o do evento em segundos: ");
	totalSegundos = ler.nextInt();
			
	horas = totalSegundos / 3600;
	minutos = (totalSegundos%3600)/60;		
	segundos = (totalSegundos%3600)%60;		
	
	System.out.println("O evento ter� dura��o de: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
	}

}
