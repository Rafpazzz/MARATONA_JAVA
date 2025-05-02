package academy.devdojo.maratona_java.javacore.Znio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/RAFAEL/GitHub/MARATONA_JAVA");
        Path clazz = Paths.get("/user/RAFAEL/GitHub/MARATONA_JAVA/Vai_todo_Mundo_Tomar_no_Cu/Tefuder.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

    }
}
