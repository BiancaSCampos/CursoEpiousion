package br.com.episouion;

public class TestaConta {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
        Conta conta1 = new Conta();
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        conta1.inicializaConta(1500f,"98059","Bianca",5806, 237);
        // executar um deposito
        conta1.deposito(500f);
        // Imprimir o saldo apos o deposito
        System.out.println(conta1.getSaldo());
        // executar um saque cujo valor seja menor que o saldo
        conta1.saque(200f);
        // Imprimir o saldo apos o deposito
        System.out.println(conta1.getSaldo());
        // executar uma retirada cujo valor seja maior que o saldo
        conta1.saque(3000f);
        // Imprimir o saldo apos o deposito
        System.out.println(conta1.getSaldo());
    }
}
