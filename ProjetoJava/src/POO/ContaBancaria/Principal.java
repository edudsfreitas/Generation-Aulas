package POO.ContaBancaria;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Homer J Simpson", 2000.00);
		 
			
		System.out.println("Boa tarde " + conta1.exibirTitular() + ", seu saldo atual: " + conta1.exibirSaldo());
		
		//conta1.sacar(500);
		
		conta1.depositar(20500.0);
		
		System.out.println("Seu novo saldo: R$" + conta1.exibirSaldo());
	}

}
