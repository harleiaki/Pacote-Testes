import java.util.ArrayList;
import java.util.List;

public class AppNomeEndereçoTelefone {
	public static void main(String[] args) {
		
		List<NomeEndereçoTelefone> lista = new ArrayList<>();
		lista.add(new NomeEndereçoTelefone(" Harlei    "  , " Paulista     Nº123 "  , 123456));
		lista.add(new NomeEndereçoTelefone(" Amendoin  "  , " Loja do lado Nº231 "  , 654321));
		lista.add(new NomeEndereçoTelefone(" Chocolate "  , " Doceria      Nº321 "  , 135789));
		
	
	
		System.out.println("\nNomeEndereçoTelefone: ");
		lista.forEach(p -> System.out.println("NomeEndereçoTelefone: " + p));
	}

}
