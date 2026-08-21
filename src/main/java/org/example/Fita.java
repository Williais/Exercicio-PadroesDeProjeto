package org.example;

import org.example.tipoFita.TipoFita;

public class Fita {
    private String tipoFita;
    private String titulo;
    private int codigoDePreco;

    public Fita(String titulo, TipoFita fita) {
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