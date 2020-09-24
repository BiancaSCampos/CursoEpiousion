package br.com.epiousion;

public class Arrays {
    public static void main(String args[]) {
        String array[] = new String[5];

        for (int i = 0; i< array.length; i++){
            array[i] ="Cliente"+(i+1)+" email: cliente"+(i+1)+"@cliente.com.br";
        }

        for (String texto : array){
            System.out.println(texto);
        }
    }
}
