package mediaNota;

 /*
  5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
  *
  */

import java.util.Scanner;

public class mediaCalculo {public static void main(String args[])
	{
	Scanner ler = new Scanner(System.in);
	
	int notaA,notaB,notaC;
	double calculo;
	System.out.println("Entre com o valor da primeira nota: ");
	notaA = ler.nextInt();
	
	System.out.println("Entre com o valor da segunda nota: ");
	notaB = ler.nextInt();
	
	System.out.println("Entre com o valor da terceira nota: ");
	notaC = ler.nextInt();
	
	calculo = ((notaA*0.2) + (notaB*0.3) + (notaC*0.5));
	
	System.out.println("M�dia: " + calculo); 
	
	}
}