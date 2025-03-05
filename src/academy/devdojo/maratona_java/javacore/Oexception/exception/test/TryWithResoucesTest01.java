package academy.devdojo.maratona_java.javacore.Oexception.exception.test;

import academy.devdojo.maratona_java.javacore.Oexception.exception.dominio.Leitor01;
import academy.devdojo.maratona_java.javacore.Oexception.exception.dominio.Leitor02;

import java.io.*;

public class TryWithResoucesTest01 {
    public static void main(String[] args) {

    }

    public static void lerArquivo() {
        try(Leitor01 leitor01 = new Leitor01(); Leitor02 leitor02 = new Leitor02()) {

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
