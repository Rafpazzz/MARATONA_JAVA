package academy.devdojo.maratona_java.javacore.Znio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttirbutesTest01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes 
        //DosFileAttributes, voltada para windows
        //PosixFileAttributes, voltada para sistema unix

        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());


        Path path = Paths.get("pasta/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));

    }
}
