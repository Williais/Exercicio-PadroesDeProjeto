package org.example;

public class Fita {
    private String tipoFita;
    private String titulo;
    private int codigoDePreco;

    public Fita(String titulo, int codigoDePreco, String tipoFita) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
        this.tipoFita = tipoFita;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getCodigoDePreco() {
        return codigoDePreco;
    }

    public String getTipoFita() {return tipoFita;}

    public void setCodigoDePreco(int codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }
}