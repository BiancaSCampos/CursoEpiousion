package br.com.episouion;

public class TestaAgencia {

    public static void main(String[] args) {
        // Inicializar um objeto do tipo Agencia
        Agencia agencia1 = new Agencia();
        // usar o metodo inicializaAgencia (ver quais sao os parametros na classe Agencia)
        agencia1.inicializaAgencia("3966", 237);
        // Imprimir os dados da agencia
        agencia1.imprimeDados();
    }
}
