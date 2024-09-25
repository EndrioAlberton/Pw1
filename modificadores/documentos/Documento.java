package documentos;

public class Documento {
	private long numero;
	
	public Documento() {}
	public Documento(long numero) {
		super();
		this.numero = numero;
	}
	public boolean valida() {
		return true;
	}
	@Override
	public String toString() {
		return "Documento -> numero=" + numero;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	
}
