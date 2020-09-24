package br.com.epiousion;

public class Teste {
    public static void main (String args[]){
        Caderno c1 = new Caderno();
        c1.setAberto(false);
        c1.setMarca("Tilibra");
        c1.setNumero_folhas(200);
        c1.setTamanho("a4");
        c1.abrirCaderno();

        c1.exibir();

        c1.fecharCaderno();

        c1.exibir();

        Caneta caneta = new Caneta();
        caneta.setCor("Preta");
        caneta.setMarca("BIC");
        caneta.setPonta(1.5f);

        caneta.destampar();
        caneta.exibir();
        caneta.escrever();

        Pote_Comida potinho = new Pote_Comida();
        potinho.setCor("azul");
        potinho.abrirPote();

        System.out.println(potinho.getCor());
        System.out.println(potinho.isAberto());


    }
}
