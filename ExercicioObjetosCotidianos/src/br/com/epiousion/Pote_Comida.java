package br.com.epiousion;

public class Pote_Comida {
    private String cor;
    private boolean aberto;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void abrirPote(){
        if (aberto){
            System.out.println("Pote já aberto");
        }
        else {
            aberto=true;
            System.out.println("pote foi aberto");
        }
    }

    public void fecharPote(){
        if (aberto){
            aberto=false;
            System.out.println("Pote foi fechado");
        }
        else {
            System.out.println("pote já estava fechado");
        }
    }

    public void exibir(){
        System.out.println(cor);
        System.out.println("Aberto: "+aberto);
    }
}
