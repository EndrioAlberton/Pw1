package testes;

import javax.swing.JOptionPane;
import cpf.Cpf;

public class TesteCpf {
	public static void main(String[] args) {

		Cpf cpf1 = new Cpf(); 
		System.out.println(cpf1.toString());
		
		Cpf cpf2 = new Cpf(111111111, 11);
		System.out.println(cpf2.toString());
		
		long num = Long.
				parseLong(JOptionPane.showInputDialog("Informe o num do CPF:"));
		int dig = Integer.
				parseInt(JOptionPane.showInputDialog("Informe o dig do CPF:"));

		Cpf cpf3 = new Cpf(num, dig);
		System.out.println(cpf3.toString());
		
		JOptionPane.showMessageDialog(null, cpf3.toString());
	}
}
