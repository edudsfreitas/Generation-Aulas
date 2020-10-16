package POO.Pessoa;

/*4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias).*/

public class Administrador extends Pessoa{
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, String cpf, double ajudaDeCusto)
	{
		super(nome,endereco,telefone,cpf);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void gastoAjuda(double valor)
	{
		if(valor > ajudaDeCusto) {
			System.out.println("O valor requisitado é maior que a Ajuda de Custo");
		} else {
			ajudaDeCusto -= valor;
		}
	}
	
	public void getInfo()
	{
		System.out.println("Nome do Administrador: " + getNome() +"\nEndereço: " + getEndereco() 
		+ "\nTelefone: " + getTelefone() + "\nAjuda de Custo: " + ajudaDeCusto);
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
}
