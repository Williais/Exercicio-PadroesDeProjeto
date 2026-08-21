package org.example.tipoFita;

import org.example.Aluguel;

public class FitaLancamento implements TipoFita{


    @Override
    public double valorFita(Aluguel dias) {
        double valorCorrente = 0.0;

        valorCorrente += dias.getDiasAlugada() * 3;

        return valorCorrente;
    }

}
