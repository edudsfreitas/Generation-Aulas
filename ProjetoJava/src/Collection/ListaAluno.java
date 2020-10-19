package Collection;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main(String[] args) {
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a= new Aluno("Iago Ribeiro","JAVA",6.8);
		Aluno b= new Aluno("Patrick Almeida","Linux",7.8);
		Aluno c= new Aluno("Paulo Gonzales","SO",5.7);
		Aluno d= new Aluno("Francisco de Souza","HTML",8);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}
}
