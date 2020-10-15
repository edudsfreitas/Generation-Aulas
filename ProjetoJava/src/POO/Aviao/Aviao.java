package POO.Aviao;

/* 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

public class Aviao {
	//atributos do aviao
	public String modelo;
	public int capacidade;
	public double velocidadeAtual;
	
	//construtor
	public Aviao(String modelo, int capacidade, double velocidadeAtual)
	{
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.velocidadeAtual = velocidadeAtual;
	}
	
	//metodo/funcao
	public void acelera(double quantidade)
	{
		this.velocidadeAtual =+ quantidade;
	}
	
	public void decola()
	{
		if (this.velocidadeAtual > 260 )
		{
			System.out.println("Liberado decolar");
		}
		else
		{
			System.out.println("Impossível decolar");
		}
	}      
}