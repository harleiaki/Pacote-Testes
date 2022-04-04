
public class Primo {
	public static void main(String[] args) {
		for (int i=2; i<=500; i++) {
			if(Primos(i))
				System.out.println("PRIMOS:" + i);
		}
	}
		public static boolean Primos(int numero) {
			for(int l=2; l < numero; l++) {
				if (numero % l ==0)
					return false;
			}
			return true;
		}
			
		}