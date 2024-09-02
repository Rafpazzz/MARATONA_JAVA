package academy.devdojo.maratona_java.introducao;

public class Aula06EstruturasDeRepericao05 {
    public static void main(String[] args) {

        double valorCarro = 48000;
        double x;

        for(int parcelaCarro = (int) valorCarro; parcelaCarro>=1; parcelaCarro--){
            double valorParcela = valorCarro/parcelaCarro;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+ parcelaCarro + " R$ "+ valorParcela);
        }
    }
}
