package exercicioslide28;
public abstract class Conta {
	private long numero;
	private double saldo;
	private Agencia agencia;
	
	public Conta() {}
	public Conta(long numero, double saldo, Agencia agencia) {
		this.numero = numero;
		this.saldo = saldo;
		this.agencia = agencia;
	}
	public long getNumero() {		return numero;	}
	public void setNumero(long numero) {		this.numero = numero;	}
	public double getSaldo() {		return saldo;	}
	public void setSaldo(double saldo) {		this.saldo = saldo;	}
	public Agencia getAgencia() {		return agencia;	}
	public void setAgencia(Agencia agencia) {		this.agencia = agencia;	}
	@Override
	public String toString() {
		return "Conta\n Número:" + numero + "\nSaldo:" + saldo + 
				"\nAgência=" + (agencia!=null?agencia.toString():"Agência inválida");
	}

	public double credita(double valor) {
		saldo += valor;
		return saldo;
	}
	public abstract double debita(double valor);
	
}
