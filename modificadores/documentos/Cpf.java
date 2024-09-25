package documentos;

public final class Cpf extends Documento{
	private int digito;
	
	public Cpf() {}
	public Cpf(long numero, int digito) {
		super(numero); 
		this.digito = digito;
	}

	public final boolean valida() {
		return true;
	}
	@Override
	public String toString() {
		return "Cpf:" + super.toString() + "-" + digito;
	}
	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}
	
	
}
