
public class NomeEndereçoTelefone {

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return Endereço;
	}
	public void setEndereço(String endereço) {
		Endereço = endereço;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
		String nome;
		String Endereço;
		int Telefone;
		@Override
		public String toString() {
			return "NomeEndereçoTelefone [nome=" + nome + ", Endereço=" + Endereço + ", Telefone=" + Telefone + "]";
		}
		public NomeEndereçoTelefone(String nome, String endereço, int telefone) {
			super();
			this.nome = nome;
			Endereço = endereço;
			Telefone = telefone;
		}		
	}


