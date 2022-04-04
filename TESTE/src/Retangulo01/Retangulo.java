package Retangulo01;

public class Retangulo {
	float base, altura, area;
	
	Retangulo(float base,float altura){
		this.base=base;
	}
	public void calcularArea() {
		area = base*altura;
		System.out.println("Area é:" + area);
	}
}
