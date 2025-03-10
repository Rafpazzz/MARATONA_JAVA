package academy.devdojo.maratona_java.javacore.Pwapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1;
        float f =10F;
        double d = 10D;
        char c = 'W';
        boolean g = false;

        Byte bW = 1;
        Short sW = 1;
        Integer iW = 1;
        Long lW = 1L;
        Float fW =10F; //autoboxing
        Double dW = 10D;
        Character cW = 'W';
        Boolean gW = false;
        //passagem de parametro sera por referncia, nao por valor, ja que se trata de um objeto.

       // int i1 = new Integer(1); //unboxing

        int y = iW;//unboxing
        Integer intW2 = Integer.parseInt("13");
        Boolean verdadeiro = Boolean.parseBoolean("true");

        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('p'));
        System.out.println(Character.isUpperCase('p'));
        System.out.println(Character.isLowerCase('p'));
        System.out.println(Character.toLowerCase('P'));
    }
}
