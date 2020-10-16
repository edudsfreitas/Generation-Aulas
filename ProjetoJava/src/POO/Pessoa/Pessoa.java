package POO.Pessoa;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private int idade;
	private String aniversario;
	private String cpf;
	
	public Pessoa(String nome, String endereco, String telefone, String cpf)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	public Pessoa(String nome,int idade, String aniversario)
	{
		this.nome = nome;
		this.idade = idade;
		this.aniversario = aniversario;
	}
	
	public void validarCpf()
	{
		if(getCpf().length()!=11)
		{
			System.out.println("CPF inválido!!!");
		}
		else
		{
			System.out.println("CPF válido");
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
