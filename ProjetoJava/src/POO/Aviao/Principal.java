package POO.Aviao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao aviao1 = new Aviao("Boeing",200,0); 
	                                                                                                              
		System.out.println("Modelo: " + aviao1.modelo +"\nCapacidade máxima: " + aviao1.capacidade + " pessoas"); 
		
		
		aviao1.acelera(270);                                                                                                                                                                                                                                                                                   
		System.out.println("Velocidade atual: " + aviao1.velocidadeAtual + " km/h");                  
		
		aviao1.decola(); 
	}

}
