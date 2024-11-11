package academy.devdojo.maratona_java.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratona_java.javacore.Fmodificadoresestaticos.domain.Carro;

public class Testcarro {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedez", 275);
        Carro c3 = new Carro("Audi", 285);

        //Carro.velocidadeLimite = 180;
        Carro.setVelocidadeLimite(200);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
