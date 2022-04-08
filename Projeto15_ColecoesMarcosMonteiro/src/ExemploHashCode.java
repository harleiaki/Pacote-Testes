
public class ExemploHashCode {
	public static void main(String[] args) {
		Pessoa a = new Pessoa("Rodrigo", 23);
		Pessoa b = new Pessoa("Claudio", 20);
		
		System.out.println(a.nome + " é igual a " + b.nome + "?" + (a.hashCode() == b.hashCode()));
		
		a.nome = b.nome; //nomes iguais, mas objetos diferentes
		
		System.out.println(a.nome + " é igual a" + b.nome + "?" + (a.hashCode() == b.hashCode()));
		
		a=b;//objetos iguais
		
		System.out.println(a.nome + " é igual a" + b.nome + "?" + (a.hashCode() == b.hashCode()) + "a" +a);
	}
}
