package org.example;

import org.example.tipoFita.FitaNormal;

public class Locadora {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juliana");
        Locacao locacao = new Locacao();

        locacao.adicionaAluguel(new Aluguel(new FitaNormal("O Exorcista ",
                Fita.NORMAL), 3));

        /*
        locacao.adicionaAluguel(new Aluguel(new Fita("Men in Black ",
                Fita.NORMAL), 2));

        locacao.adicionaAluguel(new Aluguel(new Fita("Jurassic Park III ",
                Fita.LANCAMENTO), 3));

        locacao.adicionaAluguel(new Aluguel(new Fita("Planeta dos Macacos ",
                Fita.LANCAMENTO), 4));

        locacao.adicionaAluguel(new Aluguel(new Fita("Pateta no Planeta dos Macacos ",
                Fita.INFANTIL), 10));

        locacao.adicionaAluguel(new Aluguel(new Fita("O Rei Leao ",
                Fita.INFANTIL), 30));*/

        System.out.println(Extrato.extrato(c1));
    }
}