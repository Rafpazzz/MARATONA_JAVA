package academy.devdojo.maratona_java.javacore.Znio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("patas/subpasta/file.bkp");
        Path path2 = Paths.get("patas/subpasta/file.txt");
        Path path3 = Paths.get("patas/subpasta/file.java");

        matches(path1, "glob:*.bkp");//não considera diretorios
        matches(path1, "glob:**.bkp");//considera diretorios
        matches(path1, "glob:**/*.bkp");//considera diretorios
        matches(path1, "glob:**/*.{bkp,txt,java}");//considera diretorios
        matches(path2, "glob:**/*.{bkp,txt,java}");//considera diretorios
        matches(path3, "glob:**/*.{bkp,txt,java}");//considera diretorios
        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");
        matches(path3, "glob:**/file.????");
    }

    private static void matches(Path path, String glob) {
        PathMatcher matches = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob +  ": " + matches.matches(path));
    }
}
