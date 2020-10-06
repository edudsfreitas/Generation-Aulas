package custoVeiculo;

import java.util.Scanner;

/*
 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */

public class calculoCusto {public static void main(String args[])
	{
	Scanner ler = new Scanner(System.in);
	
	float custoFabrica, custoConsumidor, totalDistribuidor, percentDistribuidor, percentImpostos;
	
	System.out.println("Insira o custo de fábrica do veículo: ");
	custoFabrica = ler.nextFloat();
			
	percentDistribuidor = (float) 0.28;
	percentImpostos = (float) 0.45;
	totalDistribuidor = (custoFabrica * percentImpostos + custoFabrica);
	custoConsumidor = (totalDistribuidor * percentImpostos + custoFabrica);

	System.out.println("O custo do carro ao cunsumidor será de: R$" + custoConsumidor);
	}
}
