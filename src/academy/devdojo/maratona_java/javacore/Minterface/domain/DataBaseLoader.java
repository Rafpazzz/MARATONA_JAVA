package academy.devdojo.maratona_java.javacore.Minterface.domain;

public class DataBaseLoader implements DataLoader, DataRemover {

    //private -> default -> pprotected -> public

    @Override
    public void load() {
        System.out.println("CArregando dados do baco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissao no abanco de dados");
    }

    public static void retriveMaxDataSiza() {
        System.out.println("Dentro do retriveMaxDataSiza da classe DataBaseLoder");
    }
}
