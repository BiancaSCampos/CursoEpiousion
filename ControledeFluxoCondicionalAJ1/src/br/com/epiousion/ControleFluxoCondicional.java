package br.com.epiousion;

public class ControleFluxoCondicional {
    public static void main(String[] args) {
        String nome = "Carolina Pereira";
        int idade = 20;
        String rg = "34.654.789-9";
        char sexo = 'F';
        double salario = 1500.0;
        int anoAtual = 2020;
        double aliquota = 0.20;
        int anoNascimento = anoAtual - idade;
        String sexoPorExtenso;
        double impostoDevido = salario * aliquota;

        if(sexo=='F'){
            sexoPorExtenso="Feminino";
        }else {
            sexoPorExtenso= "Masculino";
        }

        switch (sexo){

            case 'M':
                System.out.println("O Senhor "+ nome +", nascido no ano de "+ anoNascimento +" portador do rg de número "+
                        rg +", \n do sexo "+ sexoPorExtenso +", está registrado com o salário de R$"+ salario +" e pagará R$"
                        + impostoDevido +" de imposto" );
                break;

            case 'F':
                System.out.println("A Senhora "+ nome +", nascida no ano de "+ anoNascimento +" portadora do rg de número "+
                        rg +", \n do sexo "+ sexoPorExtenso +", está registrada com o salário de R$"+ salario +" e pagará R$"
                        + impostoDevido +" de imposto" );
                break;

            default:
                System.out.println("O Senhor(a) "+ nome +", nascido(a) no ano de "+ anoNascimento +" portador(a) do rg de número "+
                        rg +", \n do sexo "+ sexoPorExtenso +", está registrado(a) com o salário de R$"+ salario +" e pagará R$"
                        + impostoDevido +" de imposto" );
                break;
        }
    }
}
