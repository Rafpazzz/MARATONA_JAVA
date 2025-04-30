package academy.devdojo.maratona_java.javacore.Yio.Test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FIleTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean crietad = file.createNewFile();
            System.out.println("Created "+crietad);
            System.out.println("path " + file.getPath());
            System.out.println("path absolut " + file.getAbsolutePath());
            System.out.println("Is directory " + file.isDirectory());
            System.out.println("Is file " + file.isFile());
            System.out.println("É oculto " + file.isHidden());
            System.out.println("Last modfied " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean Isexists = file.exists();
            if(Isexists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
