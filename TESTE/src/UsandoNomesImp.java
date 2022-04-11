import java.util.Scanner;

public class UsandoNomesImp {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o nome: ");
	
	int i ;
	String nome = sc.next();
	
	for (i=0; i<nome.length(); i++) {
		if(i%2==0) {
			System.out.println("Posição: " + (i+1)+ " é " + nome.charAt(i));
		}
	}
}

}

