package custoVeiculo;

import java.util.Scanner;

/*
 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
 */

public class calculoCusto {public static void main(String args[])
	{
	Scanner ler = new Scanner(System.in);
	
	float custoFabrica, custoConsumidor, totalDistribuidor, percentDistribuidor, percentImpostos;
	
	System.out.println("Insira o custo de f�brica do ve�culo: ");
	custoFabrica = ler.nextFloat();
			
	percentDistribuidor = (float) 0.28;
	percentImpostos = (float) 0.45;
	totalDistribuidor = (custoFabrica * percentImpostos + custoFabrica);
	custoConsumidor = (totalDistribuidor * percentImpostos + custoFabrica);

	System.out.println("O custo do carro ao cunsumidor ser� de: R$" + custoConsumidor);
	}
}
