package academy.devdojo.maratona_java.introducao;

public class Treino01 {
    public static void main(String[] args) {
        float[] nota = new float[3];

        nota[0] = 0.0F;
        nota[1] = 3.7F;
        nota[2] = 6.0F;
        
        double media = (nota[0]+ nota[1]+ nota[2])/3;
        
        if (media>=7){
            System.out.println("Aprovado");
        } else if (media <7 && media >=4) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }

    }

}