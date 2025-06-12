package academy.devdojo.maratona_java.Generics.test;

import academy.devdojo.maratona_java.Generics.domain.Carro;
import academy.devdojo.maratona_java.Generics.service.CarroServices;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        CarroServices carroServices = new CarroServices();
        Carro carro = carroServices.retrieveAvailabalCarro();
        System.out.println("Usaanod carro r um mes...");
        carroServices.recoverRentalCarro(carro);

    }
}
