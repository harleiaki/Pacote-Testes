import javax.swing.JOptionPane;

public class Data {

static int mes;
public static void main(String[] args) {
	mes = Integer.parseInt(JOptionPane.showInputDialog(null, mes));
	switch(mes) {
	case 1:
		System.out.println("Mês:" + mes + "Janeiro");
		break;
		case 2:
			System.out.println("Mês:" + mes + "Fevereiro");
			break;
		case 3:
			System.out.println("Mês:" + mes + "Março");
			break;
			case 4:
				System.out.println("Mês:" + mes + "Abril");
				break;
			case 5:
				System.out.println("Mês:" + mes + "Maio");
				break;
				case 6:
					System.out.println("Mês:" + mes + "Junho");
					break;
				case 7:
					System.out.println("Mês:" + mes + "Julho");
					break;
					case 8:
						System.out.println("Mês:" + mes + "Agosto");
						break;
					case 9:
						System.out.println("Mês:" + mes + "Setembro");
						break;
						case 10:
							System.out.println("Mês:" + mes + "Outubro");
							break;
						case 11:
							System.out.println("Mês." + mes + "Novembro:");
								break;
							case 12:
								System.out.println("Mês:" + mes + "Dezembro");
								break;
			
		default:
	};
}


}

