package exercicioslide28;

import java.util.*;
import javax.swing.JOptionPane;


public class Menu {
	public static void main(String[] args) {
		List<ContaEspecial> contas = new ArrayList<>();
		while(true) {
		  switch(montaMenu()) {
		  case 1:
			  double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo:"));
			  long numero = Long.parseLong(JOptionPane.showInputDialog("Informe o número:"));

			  int numeroAg = Integer.parseInt(JOptionPane.showInputDialog("Informe o número:"));
			  String endereco = JOptionPane.showInputDialog("Informe o endereco:");
			  Agencia agencia = new Agencia(numeroAg, endereco);
			  double limite = Double.parseDouble(JOptionPane.showInputDialog("Informe o limite:"));
			  List<Cliente> clientes = new ArrayList<>();
			  int contCli = Integer.parseInt(JOptionPane.showInputDialog("informe total clientes"));
	    	    for(int i=0; i<contCli; i++) {
	    	    	String cpf = JOptionPane.showInputDialog("Informe o cpf:");
	    	    	String nome = JOptionPane.showInputDialog("Informe o nome:");
	    	    	clientes.add(new Cliente(cpf, nome));
	    	    }
			  contas.add(new ContaEspecial(numero, saldo, agencia, limite, clientes));
			  break;
		  case 2:
			    boolean flag = false;
	    	    long numeroPesquisa = Long.parseLong(JOptionPane.showInputDialog("Informe o número:"));
	    	    if(contas!=null) {
		    	   for (ContaEspecial conta : contas) {
		    	  	   if(conta != null) {
		    	  		   if(numeroPesquisa == conta.getNumero()) {
		    	  			  JOptionPane.showMessageDialog(null, "Conta encontrada");
		    	  			  flag = true;
		    	  		   }
		    	   	   }
		    	   }
		    	}
	    	    if(flag == false)
	    	    	JOptionPane.showMessageDialog(null, "Conta inexistente!");
	    	    break;
		  case 3:
				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da agência:"));
				flag = false;
				if(contas!=null) {
					for (ContaEspecial conta : contas) {
						if(conta != null) {
							if(numeroAgencia == conta.getAgencia().getNumero()) {
								JOptionPane.showMessageDialog(null, "Conta encontrada");
								flag = true;
							}
						}
					}
				}
				if(flag == false) JOptionPane.showMessageDialog(null, "Conta inexistente!");
			  break;
		  case 4:
				String cpf = JOptionPane.showInputDialog("Informe o cpf:");
				flag = false;
				if(contas!=null) {
					for (ContaEspecial conta : contas) {
						if(conta != null) {
							for (Cliente cliente : conta.getClientes()) {
								if(cliente.getCpf().equals(cpf)) {
									JOptionPane.showMessageDialog(null, "Conta encontrada");
									flag = true;
								}
							}
						}
					}
				}
				if(flag == false) JOptionPane.showMessageDialog(null, "Conta inexistente!");
			  break;
		  case 5:
			  System.exit(0);
			  break;			  
		  }
		}
	}
	public static int montaMenu() {
		String menu = "";
		for (ItensMenu item : ItensMenu.values()) {
			menu += item.getItem()+"\n";
		}
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
}
