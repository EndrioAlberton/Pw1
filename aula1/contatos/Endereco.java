package contatos;

public class Endereco {
	//atributos
	private String logradouro;
	private String complemento;
	private long cep;
	
	//construtores
	//construtor sempre tem o nome da classe
	public Endereco() {}
	public Endereco(String logradouro, String complemento, long cep) {
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cep = cep;
	}
	
	//métodos
	public String toString() {
		return logradouro + " " + complemento + " " + cep; 
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	
}
