package academy.devdojo.maratona_java.Exercicios.test;

import academy.devdojo.maratona_java.Exercicios.domain.Pessoa;

public class CalcFrequenciaCardiaca {
    public static void main(String[] args) {
        //Formula da freqeuncia 220 - idadePessoa;
        Pessoa p1 = new Pessoa(4, 12, 2004, "Rafael");

        System.out.println("Nome da pessoa é "+p1.getNome());
        System.out.println("a idade= "+p1.idade());
        System.out.println("Sua frequencia maxima é "+p1.frequenciaCardiacaMax());
        p1.frequenciaCardiacaAlvo();
    }
}
