package academy.devdojo.maratona_java.javacore.Minterface.domain;

public interface DataLoader {

    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissao");
    }

    
}
