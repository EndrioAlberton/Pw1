package listas_slides;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestesListas {
    public static void main(String[] args) {

    	//como declarar um ArrayList para objetos do tipo cpf?
    	ArrayList<Cpf> cpfList = new ArrayList<>();
    	    	
    	//como declarar ma linkedlista para armazenas objetos do tipo Pessoa e aluno?
    	LinkedList<Pessoa> lista = new LinkedList<>();
    	lista.add(new Pessoa());
    	lista.add(new Aluno());
    	
    	//como imprimir a lista?
    	
		for (Pessoa p : lista) {
			if(p instanceof Pessoa)
				System.out.println(p.toString());
			if(p instanceof Aluno)
                System.out.println(p.toString());
		}
    }
}
