package academy.devdojo.maratona_java.javacore.Qmaipulacaodearquivos.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LendoUmArquivo {
    public static void main(String[] args) {

        try{
            File myFile = new File("LendoArquivo.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e) {
            System.out.println("Nao foi possivel fazer a leitura do arquivo");
            e.printStackTrace();
        }
    }
    
}
