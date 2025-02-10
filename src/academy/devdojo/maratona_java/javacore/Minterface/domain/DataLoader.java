package academy.devdojo.maratona_java.javacore.Minterface.domain;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissao");
    }

    public static void retriveMaxDataSiza() {
        System.out.println("Dentro do retriveMaxDataSiza da intereface");
    }

}
