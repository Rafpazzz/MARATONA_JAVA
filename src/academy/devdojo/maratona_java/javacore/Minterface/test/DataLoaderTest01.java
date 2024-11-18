package academy.devdojo.maratona_java.javacore.Minterface.test;

import academy.devdojo.maratona_java.javacore.Minterface.domain.DataBaseLoader;
import academy.devdojo.maratona_java.javacore.Minterface.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
