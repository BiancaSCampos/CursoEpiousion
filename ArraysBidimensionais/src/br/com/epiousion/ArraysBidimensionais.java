package br.com.epiousion;

public class ArraysBidimensionais {
    public static void main(String args[]) {
        int array[][] = { { 1, 6, 7 }, { 2, 5, 1, 0 }, { 2, 4, 1, 2, 1 } };
        for (int[] variavel_aux1 : array) {
            for (int variavel_aux2 : variavel_aux1) {
                System.out.println(variavel_aux2);
            }
        }
    }
}
