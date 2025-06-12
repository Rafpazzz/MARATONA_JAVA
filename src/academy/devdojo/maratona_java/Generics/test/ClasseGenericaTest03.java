package academy.devdojo.maratona_java.Generics.test;

import academy.devdojo.maratona_java.Generics.domain.Barco;
import academy.devdojo.maratona_java.Generics.domain.Carro;
import academy.devdojo.maratona_java.Generics.service.CarroServices;
import academy.devdojo.maratona_java.Generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Jetski"), new Barco("Lancha")));
        List <Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Corolla"), new Carro("SW4")));

        RentalService<Carro> rentalService = new RentalService<>()
    }
}
