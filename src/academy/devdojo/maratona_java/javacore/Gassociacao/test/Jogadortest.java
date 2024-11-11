package academy.devdojo.maratona_java.javacore.Gassociacao.test;

import academy.devdojo.maratona_java.javacore.Gassociacao.domain.Jogador;

public class Jogadortest {

    public static void main(String[] args) {
        Jogador j1 = new Jogador("Ronaldo");
        Jogador j2 = new Jogador("Romário");
        Jogador j3 = new Jogador("Pelé");
        Jogador[] jogadores = {j1,j2,j3};
        for (Jogador jogadore : jogadores) {
            jogadore.imprime();
        }

    }


}
