package br.com.epiousion;

public class TesteRuntimeExceptions {


    public static void main(String[] args) {
        try {
            // Leitura do parametro digitado pelo usuario como parametro do main
            String parametro1 = args[0];
            int numero = Integer.parseInt("Bianca");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Informe um parametro na execução da classe");
        }catch (NumberFormatException e){
            System.out.println("Informe um parametro numérico na execução da classe");
        }

    }
}
