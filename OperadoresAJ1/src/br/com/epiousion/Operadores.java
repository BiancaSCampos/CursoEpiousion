package br.com.epiousion;

public class Operadores {

    public static void main(String[] args) {
        String nome = "Carolina Pereira";
        int idade = 20;
        String rg = "34.654.789-9";
        char sexo = 'F';
        double salario = 1500.0;
        int anoAtual = 2020;
        double aliquota = 0.20;
        int anoNascimento;
        String sexoPorExtenso;
        double impostoDevido;

        anoNascimento= anoAtual-idade;

        sexoPorExtenso = (sexo=='F') ? "Feminino" : "Masculino";

        impostoDevido = salario*aliquota;

        System.out.print("O(a) Senhor(a) " + nome + ", nascido(a) no ano de ");
        System.out.println(anoNascimento + ", portador(a) do RG de número " + rg);
        System.out.print(", do sexo " + sexoPorExtenso);
        System.out.print(", está registrado(a) com o salário de R$ " + salario);
        System.out.println(" e pagara R$ " + impostoDevido + " de imposto.");
    }
}
