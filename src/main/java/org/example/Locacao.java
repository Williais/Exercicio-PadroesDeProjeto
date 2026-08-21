package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Locacao {

    static Collection fitasAlugadas = new ArrayList();

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }


}
