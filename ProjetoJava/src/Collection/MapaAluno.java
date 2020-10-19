package Collection;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[] args) {
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>(); 
		
		Aluno a= new Aluno("Iago Ribeiro","JAVA",6.8);
		Aluno b= new Aluno("Patrick Almeida","Linux",7.8);
		Aluno c= new Aluno("Paulo Gonzales","SO",5.7);
		Aluno d= new Aluno("Francisco de Souza","HTML",8);
		
		mapa.put("Iago Ribeiro", a);
		mapa.put("Patrick Almeida",b);
		mapa.put("Paulo Gonzales",c);
		mapa.put("Francisco de Souza",d);
	
		System.out.println(mapa);
		System.out.println(mapa.get("Paulo Gonzales"));
		
		Collection<Aluno> alunos = mapa.values();
		for(Aluno loop:alunos)
		{
			System.out.println(loop);
		}
	}
}
