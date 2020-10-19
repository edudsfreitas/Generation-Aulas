package Collection;

public class Erros {
	public static void main(String[] args) {
		String frase = null;
		String novaFrase = null;
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e)
		{
			System.out.println("A frase inicial é nula, para solucionar tal problema,"
					+ " foi lhe atribuído um valor defalult");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("Frase Antiga: " + frase);
		System.out.println("Frase Nova: " + novaFrase);
	}
}
