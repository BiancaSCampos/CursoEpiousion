package br.com.epiousion;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Agencia
 * 2) Inicialize todos os atributos deste objeto
 * 3) Imprima os valores dos atributos da classe Agencia de forma a obter o
 * seguinte resultado:
 * 
 * -----------------------------
 * AGENCIA: 1    BANCO  : 234
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaAgencia {

    public static void main(String[] args) {
        Agencia agencia1 = new Agencia();
        agencia1.banco = 234;
        agencia1.numero = "1";

        System.out.println("-----------------------------");
        System.out.println("AGENCIA: "+agencia1.numero+"\t BANCO: "+agencia1.banco);
        System.out.println("-----------------------------");
    }
}
