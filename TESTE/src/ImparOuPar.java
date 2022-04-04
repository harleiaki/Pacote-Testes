import javax.swing.JOptionPane;

public class ImparOuPar {
	static int numero;
	public static void main(String[] args) {
		numero = Integer.parseInt(JOptionPane.showInputDialog("insira um numero:" + numero));
		if(numero %2==1)
		{
			System.out.println("O numero: " + numero + " impar ");
		}
		else
			System.out.println("O numero: " + numero + " par ");
	}

}
