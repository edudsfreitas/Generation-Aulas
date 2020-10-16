package POO;

public class PrincipalPessoa {
	public static void main(String[] args) 
	{
		PessoaTeste jessica = new PessoaTeste("Jessica",555);
		Funcionario1 pedro = new Funcionario1("Pedro",222,"Faturamento");
		PessoaTeste maria = new Funcionario1("Maria",795,"RH");
		Coordenador raul = new Coordenador("Raul",102,"SI");
		
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getNome());
		System.out.println(raul.getCurso());
	}
}
