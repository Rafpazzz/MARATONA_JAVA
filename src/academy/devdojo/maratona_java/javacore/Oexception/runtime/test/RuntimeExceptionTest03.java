package academy.devdojo.maratona_java.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try{
            System.out.println("Escrevendo no arquivo");
            throw new RuntimeException();
            //System.out.println("Escrevendo dados no arquvo");
//            System.out.println("Fechando recursos no SO");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recursos liberando pelo SO");
        }
    }
}
