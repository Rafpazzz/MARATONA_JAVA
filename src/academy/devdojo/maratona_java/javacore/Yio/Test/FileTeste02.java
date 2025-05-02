package academy.devdojo.maratona_java.javacore.Yio.Test;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        File fileTestDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileTestDiretorio.mkdir();
        System.out.println(isDiretorioCriado);

        File fileArquivoDiretorio = new File(fileTestDiretorio,"arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileTestDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretoriorenomeado = fileTestDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretoriorenomeado);
    }
}
