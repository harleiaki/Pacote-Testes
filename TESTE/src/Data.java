import javax.swing.JOptionPane;

public class Data {

static int mes;
public static void main(String[] args) {
	mes = Integer.parseInt(JOptionPane.showInputDialog(null, mes));
	switch(mes) {
	case 1:
		System.out.println("M�s:" + mes + "Janeiro");
		break;
		case 2:
			System.out.println("M�s:" + mes + "Fevereiro");
			break;
		case 3:
			System.out.println("M�s:" + mes + "Mar�o");
			break;
			case 4:
				System.out.println("M�s:" + mes + "Abril");
				break;
			case 5:
				System.out.println("M�s:" + mes + "Maio");
				break;
				case 6:
					System.out.println("M�s:" + mes + "Junho");
					break;
				case 7:
					System.out.println("M�s:" + mes + "Julho");
					break;
					case 8:
						System.out.println("M�s:" + mes + "Agosto");
						break;
					case 9:
						System.out.println("M�s:" + mes + "Setembro");
						break;
						case 10:
							System.out.println("M�s:" + mes + "Outubro");
							break;
						case 11:
							System.out.println("M�s." + mes + "Novembro:");
								break;
							case 12:
								System.out.println("M�s:" + mes + "Dezembro");
								break;
			
		default:
	};
}


}

