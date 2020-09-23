package br.com.epiousion;

import java.util.Scanner;

public class DeclaracaoVariaveis {

    public static void main (String args[]){

        Scanner scan =  new Scanner(System.in);

        String nome;
        int idade;
        String rg;
        char sexo;
        double salario;

        nome = "Carlos";
        idade = 18;
        rg = "9856315715-6";
        sexo = 'M';
        salario = 1599.99d;

        System.out.println("Senhor(a) "+nome+" de "+idade+" anos, portador(a) do RG de número "+rg+" do sexo ("+sexo+") e está registrado(a) com o salário com o salário de R$"+salario);
    }
}
