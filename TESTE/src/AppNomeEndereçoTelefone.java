import java.util.ArrayList;
import java.util.List;

public class AppNomeEnderešoTelefone {
	public static void main(String[] args) {
		
		List<NomeEnderešoTelefone> lista = new ArrayList<>();
		lista.add(new NomeEnderešoTelefone(" Harlei    "  , " Paulista     N║123 "  , 123456));
		lista.add(new NomeEnderešoTelefone(" Amendoin  "  , " Loja do lado N║231 "  , 654321));
		lista.add(new NomeEnderešoTelefone(" Chocolate "  , " Doceria      N║321 "  , 135789));
		
	
	
		System.out.println("\nNomeEnderešoTelefone: ");
		lista.forEach(p -> System.out.println("NomeEnderešoTelefone: " + p));
	}

}
