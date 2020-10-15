package POO.ContaBancaria;

/*6) Crie uma classe conta bancaria e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informa��es deste objeto no
console.*/

public class ContaBancaria {
	//atributos
	private String nomeTitular;
	//private int numero;
	private double saldo;
	
	//construtor
	public ContaBancaria(String nomeTitular, double saldo) {
		this.nomeTitular = nomeTitular;
		//this.numero = numero;
		this.saldo = saldo;
	}
	
	public String exibirTitular() 
	{
		return this.nomeTitular;
	}
	
	public void sacar(double valor) 
	{
		if(valor > this.saldo) {
			System.out.println("Seu saldo � insuficiente para efetuar transa��o");
		} else {
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor) 
	{
		this.saldo += valor;
	}
	
	public double exibirSaldo() 
	{
		return this.saldo;
	}
	
}