package clientes;
import contatos.Endereco;
import java.util.*;

public class Cliente {//extends Object {
	private String telefone;
	private ArrayList<Endereco> enderecos;
	
	public Cliente() {}
	public Cliente(String telefone, ArrayList<Endereco> enderecos) {
		super();
		this.telefone = telefone;
		this.enderecos = enderecos;
	}
	@Override
	public String toString() {
		String aux = "";
		if(enderecos != null) {
			for (Endereco endereco : enderecos) {
				if(endereco != null)
					aux += endereco.toString();
			}
		}
		return "Telefone:" + telefone + "\nEndereços:" + aux;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(ArrayList<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
}
