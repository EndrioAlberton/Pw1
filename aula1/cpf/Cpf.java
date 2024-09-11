package cpf;

public class Cpf {
	private long numero;
	private int digito;

	public Cpf() {}
	public Cpf(long numero, int digito) {
		this.numero = numero;
		this.digito = digito;
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cpf cpf = (Cpf) obj;
        return numero == cpf.numero && digito == cpf.digito;
    }
	
	@Override
	public String toString() {
		return "Cpf: " + numero + "-" + digito;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}
	
}
