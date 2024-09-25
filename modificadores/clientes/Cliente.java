package clientes;

public class Cliente {
	private String nome;
	private static int contador = 0;
	public static final double MAIOR_VALOR_DIVIDA = 5000.0;
	
	public Cliente() {
		this(null);
	}
	public Cliente(String nome) { 
		this.nome = nome;
		contador++;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static int getContador() {
		return contador;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "número total de objetos:"+contador;
	}
	
}
