import javax.swing.JOptionPane;

public class Semana {
	static int dia;
	public static void main(String[] args) {
	 dia = Integer.parseInt(JOptionPane.showInputDialog("Insira um dia", dia));
		switch (dia) {			
			case 1 :
				System.out.println("Dia:"+ dia +"\tDomingo");
				break;
			case 2 :
				System.out.println("Dia:"+ dia +"\tSegunda-Feira");
				break;
			case 3 :
				System.out.println("Dia:"+ dia +"\tTerça-Feira");
				break;
			case 4 :
				System.out.println("Dia:"+ dia +"\tQuarta-Feira");
				break;
			case 5 :
				System.out.println("Dia:"+ dia +"\tQuinta-Feira");
				break;
			case 6 :
				System.out.println("Dia:"+ dia +"\tSexta-Feira");
				break;
			case 7 :
				System.out.println("Dia:"+ dia +"\tSabádo");
				break;
				default:
					System.out.println( dia + "\tNão é dia da semana");
					break;
	};
	}
}