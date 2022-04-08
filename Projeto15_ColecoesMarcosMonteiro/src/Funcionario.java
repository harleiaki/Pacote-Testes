
public class Funcionario {
	
	private int matricula;
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario(int matricula, String nome, String cargo, double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario " + matricula +  nome +  cargo +  salario
			;
	}
	
	//utiliza a matricula como ordenacao natural
	

	}
	
	
	


