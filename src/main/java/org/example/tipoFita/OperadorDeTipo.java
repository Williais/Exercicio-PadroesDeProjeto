package org.example.tipoFita;

import org.example.Aluguel;

public class OperadorDeTipo {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public static double getTipoFita(String tipo, Aluguel dias) {
        switch (tipo) {
            case "normal":
                TipoFita normal = new FitaNormal();
                double result = normal.valorFita(dias);

                return result;

            case "lancamento":
                   TipoFita lancamento = new FitaLancamento();
                double resultLancamento = lancamento.valorFita(dias);

                return resultLancamento;

            case "infatil":
               TipoFita infantil = new FitaInfatil();

                double resultInfatil = infantil.valorFita(dias);

                return resultInfatil;

           default:
               return 0;
        }
    }
}
