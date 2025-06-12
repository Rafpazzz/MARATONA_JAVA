package academy.devdojo.maratona_java.Generics.service;

import academy.devdojo.maratona_java.Generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroServices {
    private List <Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Corolla"), new Carro("SW4")));

    public Carro retrieveAvailabalCarro() {
        System.out.println("Buscando carro Disponivel");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugandado carro: "+ carro);
        System.out.println("Carros disponiveis: ");
        System.out.println(carrosDisponiveis);

        return carro;
    }

    public void recoverRentalCarro(Carro carro) {
        System.out.println("Devolvendo carro: " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis: ");
        System.out.println(carrosDisponiveis);
    }
}
