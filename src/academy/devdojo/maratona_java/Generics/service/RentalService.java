package academy.devdojo.maratona_java.Generics.service;

import academy.devdojo.maratona_java.Generics.domain.Carro;

import java.util.List;

public class RentalService <T>{
    public List<T> objetosDisponveis;

    public RentalService(List<T> objetosDisponveis) {
        this.objetosDisponveis = objetosDisponveis;
    }

    public T retrieveAvailabalObjeto() {
        System.out.println("Buscando carro Disponivel");
        T obj = objetosDisponveis.remove(0);
        System.out.println("Alugandado Objeto: "+ obj);
        System.out.println("Objetos disponiveis: ");
        System.out.println(objetosDisponveis);

        return obj;
    }

    public void recoverRentalObjeto(T Objeto) {
        System.out.println("Devolvendo Objeto: " + Objeto);
        objetosDisponveis.add(Objeto);
        System.out.println("Objetos disponiveis: ");
        System.out.println(objetosDisponveis);
    }


}
