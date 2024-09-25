package exercicioslide28;

public class Cliente implements Validacoes{
	private String cpf;
	private String nome;
	public Cliente() {}
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	@Override
	public boolean validar() {
		return true;
	}
	public String getCpf() {		return cpf;	}
	public void setCpf(String cpf) {		this.cpf = cpf;	}
	public String getNome() {		return nome;	}
	public void setNome(String nome) {		this.nome = nome;	}
	@Override
	public String toString() {
		return "Cliente\n Cpf:" + cpf + "\nNome:" + nome;
	}

}
