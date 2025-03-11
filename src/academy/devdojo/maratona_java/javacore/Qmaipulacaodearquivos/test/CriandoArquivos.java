package academy.devdojo.maratona_java.javacore.Qmaipulacaodearquivos.test;

import java.io.File;
import java.io.IOException;

public class CriandoArquivos {
    public static void main(String[] args) {

        try{
            File myFile = new File("testeArquivo.txt");
            if(myFile.createNewFile()) {
                System.out.println("Arquivo criado: " + myFile.getName());
            }else {
                System.out.println("Arquivo nao criado");
            }
        }catch(IOException e) {
            System.out.println("Erro na cração do arquivo");
            e.printStackTrace();
        }
    }
}
