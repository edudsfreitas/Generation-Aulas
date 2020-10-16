package POO.Animal;

public class Cavalo extends Animal {
	private String galopar;
	
	public Cavalo()
	{
		
	}

	public String getGalopar() {
		return galopar;
	}

	public void setGalopar(String galopar) {
		this.galopar = galopar;
	}
	
	public String getNome() 
	{
		return "Cavalo: " + super.getNome() + "\nIdade: " + super.getIdade() 
		+ "\nSom: " + super.getSom() + "\nO cavalo: " + this.getGalopar() + "\n\n";
	}
}
