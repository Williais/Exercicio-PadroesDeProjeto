package org.example;
import org.example.tipoFita.OperadorDeTipo;

import java.util.Iterator;

public class Extrato {
    public static String extrato(Cliente cliente) {

        int pontosDeAlugadorFrequente = 0;
        Iterator alugueis = Locacao.fitasAlugadas.iterator();
        double valorTotal = 0.0;


        while(alugueis.hasNext()) {

            Aluguel cada = (Aluguel)alugueis.next();

            pontosDeAlugadorFrequente++;


            if(cada.getFita().getCodigoDePreco() == OperadorDeTipo.getTipoFita(cada.getFita().getTipoFita(), cada) &&
                    cada.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }


            Copiadora.digitarNome(cada);
            valorTotal += OperadorDeTipo.getTipoFita(cada.getFita().getTipoFita(), cada);
        }


        return Copiadora.digitarTotal(cliente, pontosDeAlugadorFrequente,valorTotal);
    }
}
