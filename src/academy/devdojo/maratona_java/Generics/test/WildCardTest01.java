package academy.devdojo.maratona_java.Generics.test;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public abstract void consulta ();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        List<Cachorro> c = List.of(new Cachorro(), new Cachorro());
        List<Gato> g = List.of(new Gato(), new Gato());
        printConsulta(c);
        printConsulta(g);
        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

    private static void printConsulta(List<? extends Animal> animais) { //assim faço um contrato para nao adicionar nenhum objeto na lista que estou passando
        for (Animal animal : animais) {
            animal.consulta();
        }

    }

    private static void printConsultaAnimal(List<? super Animal> animal) {
        animal.add(new Cachorro());
        animal.add(new Gato());
    }
}
