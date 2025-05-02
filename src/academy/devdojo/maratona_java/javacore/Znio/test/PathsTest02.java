package academy.devdojo.maratona_java.javacore.Znio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathsTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if(Files.notExists(pastaPath)){
            Path pataDiretorio = Files.createDirectory(pastaPath); //Lança uma excessao
        }

        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPataDiretorio = Files.createDirectories(subPastaPath); //Não lança uma excessao

        Path filePath = Paths.get(subPastaPath.toString(), "File.txt");
        if(Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);//Lança uma excessao
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "File_renamed.txt"); //filePath.toString() retorna pasta/subpasta/subsubpasta gerando: Exception in thread "main" java.nio.file.NoSuchFileException: pasta\subpasta\subsubpasta\File.txt -> pasta\subpasta\subsubpasta\File.txt\File_renamed.txt
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
