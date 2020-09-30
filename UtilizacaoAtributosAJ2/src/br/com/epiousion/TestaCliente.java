package br.com.epiousion;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Crie um objeto da classe Cliente 
 * 2) Inicialize todos os atributos deste objeto
 * 3) Imprima os valores dos atributos da classe Cliente de forma a obter o seguinte resultado:
 * 
 * --------------------------------- 
 * NOME: Globalcode     CPF : 123154 
 * ---------------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaCliente {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.nome = "GlobalCode";
        c1.cpf = "123154 ";

        System.out.println("--------------------------------- ");
        System.out.println("NOME: "+ c1.nome +"\t CPF: "+ c1.cpf);
        System.out.println("--------------------------------- ");

    }
}
