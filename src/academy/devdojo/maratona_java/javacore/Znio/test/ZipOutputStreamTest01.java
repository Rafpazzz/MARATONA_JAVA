package academy.devdojo.maratona_java.javacore.Znio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivosZip = Paths.get("pasta\\arquixvo.zip");
        Path arquivosParaZipar = Paths.get("pasta\\SubPasta1\\SubsubPasta1");
        zip(arquivosZip, arquivosParaZipar);
    }

    private static void zip(Path arquivoZip, Path arquivos) {
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip)); DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivos)) {
            for(Path files : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(files.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(files, zipStream);
                zipStream.closeEntry();

            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
