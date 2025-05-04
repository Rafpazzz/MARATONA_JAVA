package academy.devdojo.maratona_java.javacore.Znio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/novo_path.txt");
        //aqui retona o que voce passa como objeto
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime modifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("CreationTime: " + creationTime);
        System.out.println("LastAcessTime: " + lastAccessTime);
        System.out.println("ModifileTime: " + modifiedTime);

        //pussui View é utilizado para fazer altereração com o que diponibilizão
        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        basicFileAttributeView.setTimes(modifiedTime, newCreationTime, creationTime);

        creationTime = basicFileAttributeView.readAttributes().creationTime();
        modifiedTime = basicFileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = basicFileAttributeView.readAttributes().lastAccessTime();

        System.out.println("==================");

        System.out.println("CreationTime: " + creationTime);
        System.out.println("LastAcessTime: " + lastAccessTime);
        System.out.println("ModifileTime: " + modifiedTime);

    }
}
