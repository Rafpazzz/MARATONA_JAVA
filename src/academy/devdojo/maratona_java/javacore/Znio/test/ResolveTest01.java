package academy.devdojo.maratona_java.javacore.Znio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("pata/subpasta/subsubpasta");
        Path arquivo = Paths.get("subsub/File.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

    }
}
