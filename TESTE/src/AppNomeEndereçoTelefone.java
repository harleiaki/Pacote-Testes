import java.util.ArrayList;
import java.util.List;

public class AppNomeEndere�oTelefone {
	public static void main(String[] args) {
		
		List<NomeEndere�oTelefone> lista = new ArrayList<>();
		lista.add(new NomeEndere�oTelefone(" Harlei    "  , " Paulista     N�123 "  , 123456));
		lista.add(new NomeEndere�oTelefone(" Amendoin  "  , " Loja do lado N�231 "  , 654321));
		lista.add(new NomeEndere�oTelefone(" Chocolate "  , " Doceria      N�321 "  , 135789));
		
	
	
		System.out.println("\nNomeEndere�oTelefone: ");
		lista.forEach(p -> System.out.println("NomeEndere�oTelefone: " + p));
	}

}
