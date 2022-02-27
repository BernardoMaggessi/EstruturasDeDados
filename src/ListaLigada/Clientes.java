package ListaLigada;

public class Clientes {
	private String cpf;
	private String nome;

	public Clientes(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}

	public Clientes() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Clientes [cpf=" + cpf + ", nome=" + nome + "]";
	}
	
}
