package br.com.episouion;

public class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
        Cliente cliente1 = new Cliente();
        // Inicializacao do cliente usando o metodo inicializaCliente
        cliente1.inicializaCliente("Bianca da Silva Campos", "985647498");
        // Impressao dos dados do cliente
        cliente1.imprimeDados();
    }
}
