package testes;

import documentos.Documento;

public class TesteFinal {
	public static void main(String args[]) {
		Documento d = new Documento();
		if(d.valida())
		System.out.println("Documento válido");
		}
}
