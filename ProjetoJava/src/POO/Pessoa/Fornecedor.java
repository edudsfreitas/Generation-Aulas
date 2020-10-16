package POO.Pessoa;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, String cpf, double valorCredito, double valorDivida)
	{
		super(nome,endereco,telefone,cpf);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}
	
	public void getInfo()
	{
		System.out.println("Nome do Fornecedor: " + getNome() +"\nEndere�o: " + getEndereco() 
		+ "\nTelefone: " + getTelefone() + "\nCredito dispon�vel: " + valorCredito 
		+ "\nD�vida total:" + valorDivida );
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public void obterSaldo()
	{
		double saldo = valorCredito - valorDivida;
		System.out.println("A diferen�a entre o cr�dito e a d�vida �: " + saldo);
		
	}

}
