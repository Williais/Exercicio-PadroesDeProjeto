package org.example;

import org.example.tipoFita.OperadorDeTipo;

public class Copiadora {

    public static String digitarTotal(Cliente cliente, int pontosDeAlugadorFrequente,  double valorTotal) {

        final String fimDeLinha = System.getProperty("line.separator");

        String resultado = "Registry de Alugueis de " + cliente.getNome() + fimDeLinha;

        resultado += "Valor total devido: " + valorTotal + fimDeLinha;

        resultado += "Voce acumulou " + pontosDeAlugadorFrequente +
                " pontos de alugador frequente";

        return resultado;

    }

    public static String digitarNome( Aluguel cada){
        final String fimDeLinha = System.getProperty("line.separator");


        String resultado = "\t" + cada.getFita().getTitulo()
                + "\t"
                + OperadorDeTipo.getTipoFita(cada.getFita().getTipoFita(), cada)
                + fimDeLinha;

        return resultado;
    }
}
