package testes;
import clientes.*;
public class TesteStatic {
	public static void main(String[] args) {
		Cliente cli = new Cliente();
		System.out.println(cli.toString());
		System.out.println(Cliente.getContador());
		
		Cliente clientes[] = new Cliente[4];
		for (int i=0; i< 4; i++) {
			clientes[i] = new Cliente("nome"+i);
		}
		
		System.out.println("Total de objetos: " + Cliente.getContador());
	}
}
