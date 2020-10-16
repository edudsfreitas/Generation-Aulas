package POO.Animal;

public class Cachorro extends Animal{
	private String movimento;
	
	public Cachorro()
	{
	
	}

	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}

		
	public String getNome() 
	{
		return "Cachorro: " + super.getNome() + "\nIdade: " + super.getIdade() 
		+ "\nSom: " + super.getSom() + "\nO cachorro: " + this.getMovimento() + "\n\n";
	}

}
