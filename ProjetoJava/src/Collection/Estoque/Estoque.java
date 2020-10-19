/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

package Collection.Estoque;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		String insert;
		int opcao;
		Scanner ler = new Scanner(System.in);
		
		Collection<String> produtos = new ArrayList<String>();
		produtos.add("Arroz");
		produtos.add("Feijão");
		produtos.add("Tomate");
		
		do
		{
			System.out.println("Selecione a opção desejada: \n[1] - Adicionar produto \n[2] - Remover produto "
					+ "\n[3] - Atualizar produto \n[4] - Exibir estoque");
			opcao = ler.nextInt();	
			
			switch (opcao){
			
				case 1: 
				
					System.out.println(" ");
					System.out.println("Insira um produto: ");
					insert = ler.next();
					produtos.add(insert);
					break;
				
				case 2:
				
					System.out.println(" ");
					System.out.println("Remover produto: ");
					insert = ler.next();
					produtos.remove(insert);
					break;
				
				case 3: 
				
					System.out.println("Primeiramente, digite o produto cadastrado que deseja substituir: ");
					insert = ler.next();
					
					if(produtos.contains(insert))
					{
						System.out.println(" ");
						produtos.remove(insert);
						System.out.println("Insira o novo produto : ");
						insert = ler.next();
						produtos.add(insert);				
					}
					else
					{
						System.out.println(" ");
						System.out.println("O produto digitado não existe.\n");
					}
					break;
					
				case 4:
					
					System.out.println(" ");
					System.out.println(produtos + "\n");
					
					
			}
		}while(opcao!=0);
				
		ler.close();
		
		
		
		
		
		
		
		
		
		
	}
}
