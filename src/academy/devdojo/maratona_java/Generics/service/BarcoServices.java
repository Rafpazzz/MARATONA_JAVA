package academy.devdojo.maratona_java.Generics.service;

import academy.devdojo.maratona_java.Generics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoServices {
    private List <Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Jetski"), new Barco("Lancha")));

    public Barco retrieveAvailabalBarco() {
        System.out.println("Buscando Barco Disponivel");
        Barco Barco = barcosDisponiveis.remove(0);
        System.out.println("Alugandado Barco: "+ Barco);
        System.out.println("Barcos disponiveis: ");
        System.out.println(barcosDisponiveis);

        return Barco;
    }

    public void recoverRentalBarco(Barco Barco) {
        System.out.println("Devolvendo Barco: " + Barco);
        barcosDisponiveis.add(Barco);
        System.out.println("Barcos disponiveis: ");
        System.out.println(barcosDisponiveis);
    }
}
