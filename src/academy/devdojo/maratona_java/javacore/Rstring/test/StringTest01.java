package academy.devdojo.maratona_java.javacore.Rstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "rafael";// string constant pool
        String nome2 = "rafael";
        nome.concat(" paz"); // por conta da imurtabiulidade da String, o valor dentro dela nao vai ser alterado.
        nome = nome.concat(" paz"); // agora a variavel nome vai fazer referencia a uma outa string craida na string constant pool.
//        System.out.println(nome.equals(nome2)); valodando o valor da variavel.
        System.out.println(nome == nome2); // comparando a referencia do objeto.
        String nome3 = new String("rafael");
        System.out.println(nome2 == nome3);//comparo com o objeto nome3
        System.out.println(nome2 == nome3.intern()); //comparo com o valor que esta dentro do obeto.
    }
}
