package br.com.epiousion;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {

        Conta conta1 = new Conta(4000f, "98059", "bianca", "3328", 458);
        conta1.imprimeDados();

        Cliente cliente1 = new Cliente("Allan", "85964758-9");
        cliente1.imprimeDados();

    }
}
