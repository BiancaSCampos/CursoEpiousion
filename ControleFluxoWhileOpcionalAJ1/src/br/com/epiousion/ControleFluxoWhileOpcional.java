package br.com.epiousion;

public class ControleFluxoWhileOpcional {
    public static void main(String[] args) {
        int limiteInferior = 14;
        int limiteSuperior = 1578;
        int numerosDiv6 = 0;
        int variavel_auxiliar = limiteInferior;

        while (variavel_auxiliar <= limiteSuperior){
            if (variavel_auxiliar % 6 == 0){
                numerosDiv6++;
            }
            variavel_auxiliar++;
        }

        String texto = "Quantidade de numeros divisiveis por 6 entre ";

        System.out.println(texto + limiteInferior + " é " + limiteSuperior
                + " e : " + numerosDiv6);
    }
}
