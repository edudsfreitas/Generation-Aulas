package POO.Animal;

public class Preguica extends Animal{
	private String escalar;
	
	public Preguica()
	{
	
	}

	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	
	public String getNome() 
	{
		return "Pregui�a: " + super.getNome() + "\nIdade: " + super.getIdade() 
		+ "\nSom: " + super.getSom() + "\nA pregui�a: " + this.getEscalar() + "\n\n";
	}
}
