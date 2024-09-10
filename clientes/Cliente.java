package clientes;
import java.util.*;
import contatos.Endereco;

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
		//verifica se a lista existe - não é nula
		if(enderecos != null) {
			//percorre a lista pegando cada um dos endereços
			for (Endereco endereco : enderecos) {
				//verifica se cada elemento da lista existe, não é nulo
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
