
public class NomeEndere�oTelefone {

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return Endere�o;
	}
	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
		String nome;
		String Endere�o;
		int Telefone;
		@Override
		public String toString() {
			return "NomeEndere�oTelefone [nome=" + nome + ", Endere�o=" + Endere�o + ", Telefone=" + Telefone + "]";
		}
		public NomeEndere�oTelefone(String nome, String endere�o, int telefone) {
			super();
			this.nome = nome;
			Endere�o = endere�o;
			Telefone = telefone;
		}		
	}


