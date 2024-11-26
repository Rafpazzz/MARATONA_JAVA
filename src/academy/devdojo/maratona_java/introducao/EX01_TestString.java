package academy.devdojo.maratona_java.introducao;

public class EX01_TestString {
    public static void main(String[] args) {
        String a = "A family is made up of a husband, wife, son and daughter";

        a = a.replaceAll("wolmen", "person");
        a = a.replaceAll("man", "person");
        a = a.replaceAll("son", "child");
        a = a.replaceAll("daughter", "child");
        a = a.replaceAll("wife", "spouse");
        a = a.replaceAll("husband", "spouse");

        System.out.println(a);
    }
}
