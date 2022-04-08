import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
	
	public static void main(String[] args) {
		
		List<String> países = new ArrayList<>();
		
		países.add("Brasil");
		países.add("Portugal");
		países.add("Estados Unidos");
		países.add("França");
		países.add("Inglaterra");
		países.add(2, "Itália");
		
		System.out.println("Países na ordem original: ");
		países.forEach(curso -> System.out.println(" - " + curso));
		
		System.out.println("======================");
		
		//verifica se esta lista possui o String "Estados Unidos"
		System.out.println(países.contains("Estados Unidos"));
		
		//imprime o item na posição 2
		System.out.println(países.get(2));
		
		//imprime o tamanho desta lista
		System.out.println(países.size());
		
		//imprime em que posição da lista está a "França"
		System.out.println(países.indexOf("França"));
		
		//substitui todos os elementos pelo seu conteúdo em maíusculo
		países.replaceAll(s -> s.toUpperCase());
		
		//reordena todo a lista utilizando a ordem natural de Strings
		países.sort((x,y) -> x.compareTo(y));
		
		System.out.println("====================");
		
		System.out.println("Países ordenados e em maiúsculo: ");
		países.forEach(curso -> System.out.println(" - " + curso));		
	}
}
