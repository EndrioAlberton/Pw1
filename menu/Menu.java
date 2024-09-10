package menu;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import clientes.ClientePessoaFisica;
import contatos.Endereco;
import cpf.Cpf;

public class Menu {
    private static ArrayList<ClientePessoaFisica> clientes = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            switch (montaMenu()) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    pesquisarPorNome();
                    break;
                case 3:
                    pesquisarPorCpf();
                    break;
                case 4:
                    pesquisarPorEndereco();
                    break;
                case 5:
                    listarClientes();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        }
    }

    private static void cadastrarCliente() {
        try {
            String telefone = JOptionPane.showInputDialog("Informe o telefone:");
            int contEnd = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de endereços:"));
            ArrayList<Endereco> enderecos = new ArrayList<>();
            for (int i = 0; i < contEnd; i++) {
                String logradouro = JOptionPane.showInputDialog("Informe o logradouro:");
                String complemento = JOptionPane.showInputDialog("Informe o complemento:");
                long cep = Long.parseLong(JOptionPane.showInputDialog("Informe o cep:"));
                Endereco endereco = new Endereco(logradouro, complemento, cep);
                enderecos.add(endereco);
            }
            String nome = JOptionPane.showInputDialog("Informe o nome:");
            long numero = Long.parseLong(JOptionPane.showInputDialog("Informe o número do CPF:"));
            int digito = Integer.parseInt(JOptionPane.showInputDialog("Informe o dígito do CPF:"));
            Cpf cpf = new Cpf(numero, digito);
            ClientePessoaFisica cliente = new ClientePessoaFisica(telefone, enderecos, nome, cpf);
            clientes.add(cliente);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao processar entrada. Verifique os dados e tente novamente.");
        }
    }

    private static void pesquisarPorNome() {
        String nome = JOptionPane.showInputDialog("Informe o nome do cliente:");
        boolean encontrado = false;
        for (ClientePessoaFisica cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, cliente.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }

    private static void pesquisarPorCpf() {
        try {
            long numero = Long.parseLong(JOptionPane.showInputDialog("Informe o número do CPF:"));
            int digito = Integer.parseInt(JOptionPane.showInputDialog("Informe o dígito do CPF:"));
            Cpf cpf = new Cpf(numero, digito);
            boolean encontrado = false;
            for (ClientePessoaFisica cliente : clientes) {
                if (cliente.getCpf().equals(cpf)) {
                    JOptionPane.showMessageDialog(null, cliente.toString());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao processar CPF. Verifique os dados e tente novamente.");
        }
    }

    private static void pesquisarPorEndereco() {
        String logradouro = JOptionPane.showInputDialog("Informe o logradouro do endereço:");
        boolean encontrado = false;
        for (ClientePessoaFisica cliente : clientes) {
            for (Endereco endereco : cliente.getEnderecos()) {
                if (endereco.getLogradouro().equalsIgnoreCase(logradouro)) {
                    JOptionPane.showMessageDialog(null, cliente.toString());
                    encontrado = true;
                    break;
                }
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado com o endereço informado.");
        }
    }

    private static void listarClientes() {
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (ClientePessoaFisica cliente : clientes) {
                sb.append(cliente.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    private static int montaMenu() 
	{
        String menu = "1 - Cadastrar Cliente Pessoa Física\n" +
                      "2 - Pesquisar Cliente Pessoa Física pelo nome\n" +
                      "3 - Pesquisar Cliente Pessoa Física pelo CPF\n" +
                      "4 - Pesquisar Cliente Pessoa Física pelo endereço\n" +
                      "5 - Listar todos os clientes\n" +
                      "6 - Sair";
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(menu));
        } catch (NumberFormatException e) {
            return 0;
    	}
	}
}