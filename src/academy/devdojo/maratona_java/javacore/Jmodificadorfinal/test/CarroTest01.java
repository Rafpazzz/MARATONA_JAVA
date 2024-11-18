package academy.devdojo.maratona_java.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratona_java.javacore.Jmodificadorfinal.domain.Carro;
import academy.devdojo.maratona_java.javacore.Jmodificadorfinal.domain.Comprador;
import academy.devdojo.maratona_java.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro1.COMPRADOR);
        carro1.COMPRADOR.setNome("Rafael");
        System.out.println(carro1.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        carro1.setNome("Enzo");
        ferrari.setCarro(carro1);
        ferrari.imprime();
    }
}
