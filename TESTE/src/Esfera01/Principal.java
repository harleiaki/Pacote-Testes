package Esfera01;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Numero de esfera e:" + Esfera.getCont());
		
		Esfera x = new Esfera(4.5);
		Esfera y = new Esfera(3.0);
		
		System.out.println("Numero de esfera e:" + Esfera.getCont());
		System.out.println("O volume de X e:" + x.volume());
		System.out.println("O volume de Y e:" + y.volume());
		
	}
		
}
