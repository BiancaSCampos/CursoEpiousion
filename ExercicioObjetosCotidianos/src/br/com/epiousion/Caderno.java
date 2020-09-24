package br.com.epiousion;

import java.util.Scanner;

public class Caderno {
    private String marca;
    private int numero_folhas;
    private String tamanho;
    private boolean aberto;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumero_folhas() {
        return numero_folhas;
    }

    public void setNumero_folhas(int numero_folhas) {
        this.numero_folhas = numero_folhas;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void abrirCaderno(){
        if (aberto){
            System.out.println("Caderno já aberto");
        }
        else {
            aberto = true;
            System.out.println("Caderno foi aberto");
        }
    }

    public void fecharCaderno(){
        if (aberto){
            aberto=false;
            System.out.println("Caderno foi fechado");
        }
        else {
            System.out.println("Caderno já fechado");
        }
    }

    public void tirarFolhas(){
        Scanner scan = new Scanner(System.in);

        if (aberto) {
            System.out.println("Insira quantas folhas deseja tirar");
            int num_folhas_a_tirar = scan.nextInt();


            if (num_folhas_a_tirar<=numero_folhas){
                numero_folhas=(numero_folhas-num_folhas_a_tirar);
            }
            else{
                System.out.println("Impossível retirar esta quantidade de folhas");
            }
        }
        else {
            System.out.println("Caderno fechado, impossivel tirar folhas");
        }
    }

    public void exibir(){
        System.out.println(marca);
        System.out.println(numero_folhas);
        System.out.println(tamanho);
        System.out.println("Aberto:"+aberto );
    }
}
