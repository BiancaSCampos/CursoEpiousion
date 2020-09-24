package br.com.epiousion;

public class Caneta {
    private String cor;
    private float ponta;
    private String marca;
    private boolean tampada;


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void escrever(){
        System.out.println("Escrevendo");
    }

    public void rabiscar(){
        System.out.println("Rabiscando");
    }

    public void tampar(){
        if (tampada){
            System.out.println("Caneta já está tampada");
        }
        else {
            tampada = true;
            System.out.println("Caneta tampada: "+tampada);
        }
    }


    public void destampar() {
        if (tampada) {
            tampada = false;
            System.out.println("Cantada tampada: " + tampada);
        } else {
            System.out.println("Caneta já destampada");
        }
    }


    public void exibir(){
        System.out.println(marca);
        System.out.println(cor);
        System.out.println(ponta);
        System.out.println("Tampada:"+tampada);
    }


}

