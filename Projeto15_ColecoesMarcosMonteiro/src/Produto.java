
public class Produto {
	
	private String nome;
	private String categoria;
	private double pre�o;
	
	

	public Produto(String nome, String categoria, double pre�o) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.pre�o = pre�o;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	
	public String toString() {
		return "Produto" + nome + categoria + pre�o ;
	}
	
	

	
	

}
