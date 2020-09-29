package br.com.epiousion.impostos;

public interface Tributavel {
    public String getDescricaoTributavel();
    public String getNomeImposto();
    public double calcularImpostos();
}
