package POO.Pessoa;

public class TesteAdministrador {
	public static void main(String[] args) { 
		Administrador admin1 = new Administrador("Charles Chaplin","Av. Hollywood, 303","2003-3002","03694020321",5000);
		
		admin1.getInfo();
		
		admin1.gastoAjuda(2000);
		
		admin1.getInfo();
		
	}
}
