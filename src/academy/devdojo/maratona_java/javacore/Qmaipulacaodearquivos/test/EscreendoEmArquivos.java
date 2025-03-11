package academy.devdojo.maratona_java.javacore.Qmaipulacaodearquivos.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscreendoEmArquivos {
    public static void main(String[] args) {

        try{
            FileWriter myFile = new FileWriter("Escrevendo.txt");
            myFile.write("Escrevendo um texto no meu arquivo");
            myFile.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro na escrita do arquivo");
            e.printStackTrace();
        }
    }
}
