import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
	
	public static void main(String[] args) {
		
		List<String> pa�ses = new ArrayList<>();
		
		pa�ses.add("Brasil");
		pa�ses.add("Portugal");
		pa�ses.add("Estados Unidos");
		pa�ses.add("Fran�a");
		pa�ses.add("Inglaterra");
		pa�ses.add(2, "It�lia");
		
		System.out.println("Pa�ses na ordem original: ");
		pa�ses.forEach(curso -> System.out.println(" - " + curso));
		
		System.out.println("======================");
		
		//verifica se esta lista possui o String "Estados Unidos"
		System.out.println(pa�ses.contains("Estados Unidos"));
		
		//imprime o item na posi��o 2
		System.out.println(pa�ses.get(2));
		
		//imprime o tamanho desta lista
		System.out.println(pa�ses.size());
		
		//imprime em que posi��o da lista est� a "Fran�a"
		System.out.println(pa�ses.indexOf("Fran�a"));
		
		//substitui todos os elementos pelo seu conte�do em ma�usculo
		pa�ses.replaceAll(s -> s.toUpperCase());
		
		//reordena todo a lista utilizando a ordem natural de Strings
		pa�ses.sort((x,y) -> x.compareTo(y));
		
		System.out.println("====================");
		
		System.out.println("Pa�ses ordenados e em mai�sculo: ");
		pa�ses.forEach(curso -> System.out.println(" - " + curso));		
	}
}
