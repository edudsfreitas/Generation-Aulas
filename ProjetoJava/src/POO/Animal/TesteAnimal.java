package POO.Animal;

public class TesteAnimal {
	public static void main(String[] args) 
	{
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Lulu");
		cachorro.setIdade(5);
		cachorro.setSom("au au au");
		cachorro.setMovimento("Corre");
		
			
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Pé de Pano");
		cavalo.setIdade(7);
		cavalo.setSom("iiiirrórrórrórró");
		cavalo.setGalopar("Galopa");
		
		Preguica preguica = new Preguica();
		preguica.setNome("Prego");
		preguica.setIdade(4);
		preguica.setSom("...");
		preguica.setEscalar("Escala árvores");
		
		Animal[] animais = new Animal[3];
		animais[0] = cachorro;
		animais[1] = cavalo;				
		animais[2] = preguica;		
		
		for (Animal loop:animais)
		{
			System.out.println(loop.getNome());
		}
		
		
	}
}
