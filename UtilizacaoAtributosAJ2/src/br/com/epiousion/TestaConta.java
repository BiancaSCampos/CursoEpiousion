package br.com.epiousion;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.agencia= 1;
        conta1.banco= 234;
        conta1.numero = "01945";
        conta1.titular = "Globalcode ";
        conta1.saldo = 10000f;

        System.out.println("-----------------------------");
        System.out.println("AGENCIA: "+conta1.agencia+"\t BANCO: "+conta1.banco);
        System.out.println("NUMERO: "+conta1.numero);
        System.out.println("TITULAR: "+conta1.titular);
        System.out.println("SALDO: "+conta1.saldo);
        System.out.println("-----------------------------");

    }
}
