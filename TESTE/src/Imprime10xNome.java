public class Imprime10xNome {
	public static void main(String[] args) {
		for (int i=0; i<=10; i++) {
			if(Harlei(i))
				System.out.println("Harlei:" + i);
		}
	}
		public static boolean Harlei(int numero) {
			for(int l=10; l < numero; l++) {
				if (numero % l ==0)
					return false;
			}
			return true;
		}
			
		}
	
