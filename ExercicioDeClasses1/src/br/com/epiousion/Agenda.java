package br.com.epiousion;

public class Agenda {

    public static void main (String args[]){

        Contato c1 = new Contato();
        c1.setNome("Bianca da Silva Campos");
        c1.setEmail("biancascampos0410@gmail.com");
        c1.setDdd(15);
        c1.setNumero_telefone(998371757);

        System.out.println(c1.getNome());
        System.out.println(c1.getEmail());
        System.out.println("Telefone: "+ "("+c1.getDdd()+") "+c1.getNumero_telefone());
    }
}
