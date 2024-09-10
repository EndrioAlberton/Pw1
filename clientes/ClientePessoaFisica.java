package clientes;
import java.util.ArrayList;

import contatos.Endereco;
import cpf.Cpf;

public class ClientePessoaFisica extends Cliente {
	private String nome;
	private Cpf cpf;
	
	public ClientePessoaFisica() {}
	public ClientePessoaFisica(String telefone, ArrayList<Endereco> enderecos,
		String nome, Cpf cpf) {
		super(telefone, enderecos);
		this.nome = nome;
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return super.toString() + "\nNome:"+nome + "\n"+ 
				(cpf!=null?cpf.toString():"CPF inválido");
	}
	public String getNome() {		
		return nome;	
		}
	public void setNome(String nome) {		
		this.nome = nome;	
		}
	public Cpf getCpf() {		
		return cpf;	
	}
	public void setCpf(Cpf cpf) {		
		this.cpf = cpf;	
	}
}
