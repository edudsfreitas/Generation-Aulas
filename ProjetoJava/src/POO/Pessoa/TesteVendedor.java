package POO.Pessoa;


public class TesteVendedor {
	public static void main(String[] args) {
		Vendedor vendedor1 = new Vendedor("Julia Silva","Av das Oliveiras, 588","2567-6862","97885532121",1000,40);
		
		vendedor1.getInfo();
		vendedor1.porcentagemComissao();
		
	}
}
