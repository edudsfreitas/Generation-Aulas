package POO.Pessoa;

public class Vendedor extends Pessoa {

	/* Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
	tem como atributos da classe Pessoa e os como também os atributos próprivalorVendas
	(correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem
	do valorVendas que será adicionado ao vencimento base do Vendedor).*/
	
	private double valorVendas;
	private int comissao;
		
	public Vendedor (String nome, String endereco, String telefone, String cpf, double valorVendas, int comissao)
	{
		super(nome,endereco,telefone,cpf);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public void getInfo()
	{
		System.out.println("Nome do Vendedor: " + getNome() + "\nCPF: " + getCpf() +"\nEndereço: " + getEndereco() 
		+ "\nTelefone: " + getTelefone() + "\nValor total de vendas: " + valorVendas
		+ "\nComissão do vendedor: " + comissao + "%");
	}
		
	public void porcentagemComissao() // PORCENTAGEM
	{
		double valor = (valorVendas * comissao) / 100;
		System.out.println("Comissão recebida: " + valor);
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
}