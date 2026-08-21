package org.example.tipoFita;

import org.example.Aluguel;

public class FitaInfatil implements TipoFita{

    @Override
    public double valorFita(Aluguel diasAluguel) {
        double valorCorrente = 0.0;

        if(diasAluguel.getDiasAlugada() > 3) {
            valorCorrente += (diasAluguel.getDiasAlugada() - 3) * 1.5;
        }

        return valorCorrente;
    }
}
