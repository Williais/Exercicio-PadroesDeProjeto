package org.example.tipoFita;

import org.example.Aluguel;

public class FitaNormal implements TipoFita {

    @Override
    public double valorFita(Aluguel dias) {
        double valorCorrente = 0.0;

        valorCorrente += 2;
        if(dias.getDiasAlugada() > 2) {
            valorCorrente += (dias.getDiasAlugada() - 2) * 1.5;
        }

        return valorCorrente;
    }
}
