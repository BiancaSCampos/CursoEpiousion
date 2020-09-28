package br.com.episouion;

public class Cliente {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param nomeCliente
     *            nome do cliente
     * @param cpfCliente
     *            cpf do cliente
     */
    public void inicializaCliente(String nomeCliente, String cpfCliente) {
        this.cpf = cpfCliente;
        this.nome = nomeCliente;
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome do cliente :" + this.nome);
        System.out.println("CPF:" + this.cpf);
        System.out.println("----------------------");
    }
}