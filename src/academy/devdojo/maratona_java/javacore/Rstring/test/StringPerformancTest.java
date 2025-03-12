package academy.devdojo.maratona_java.javacore.Rstring.test;

public class StringPerformancTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatenaString(3000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto de execução: "+ (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatenaStringBilder(300000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto de execução da sb: "+ (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatenaStringBuffer(300000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto de execução da sbuffer: "+ (fim - inicio) + "ms");
    }

    private static void concatenaString(int tam) {
        String texto = "";
        for(int i = 0; i<=tam; i++) {
            texto += i;
        }
    }

    private static void concatenaStringBilder(int tam) {
        StringBuilder sd = new StringBuilder(tam);
        for(int i = 0; i<=tam; i++) {
            sd.append(i);
        }
    }

    private static void concatenaStringBuffer(int tam) {
        StringBuffer sd = new StringBuffer(tam);
        for(int i = 0; i<=tam; i++) {
            sd.append(i);
        }
    }
}
