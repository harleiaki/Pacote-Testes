import java.util.Scanner;

public class UsandoNomesPar {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		
		int i ;
		String nome = sc.next();
		
		for (i=0; i<nome.length(); i++) {
			if(i%2==1) {
				System.out.println("Posição: " + (1+i)+ " é " + nome.charAt(i));
			}
		}
	}

}
