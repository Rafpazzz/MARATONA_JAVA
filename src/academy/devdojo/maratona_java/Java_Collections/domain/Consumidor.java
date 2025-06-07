package academy.devdojo.maratona_java.Java_Collections.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private Long Id;
    private String nome;

    public Consumidor(String nome) {
        this.Id = ThreadLocalRandom.current().nextLong(0,100000);
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(Id, that.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
