package Esfera01;

public class Esfera {
	static final double PI = 3.14;
	static int cont = 0;
	
	double raio;
	double centrox;
	double centroy;
	double centroz;
	
	Esfera ( double raio){
		this.raio = raio;
		cont++;
	}
	static int getCont() {
		return cont;
	}
	
	double volume() {
		return 4.0/3.0*PI*raio*raio*raio;
	}
	
	public static void main(String args[]) {
		System.out.println("Numero de esfera e:" + getCont());
	}
}
