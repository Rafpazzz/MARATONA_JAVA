package academy.devdojo.maratona_java.introducao;

public class Aula06EstruturasDeRepericao04 {
    public static void main(String[] args) {

        double valorCarro = 48000;
        double x;

        for(int parcelaCarro = 1; parcelaCarro<=valorCarro; parcelaCarro++){
            double valorParcela = valorCarro/parcelaCarro;
            if (valorParcela>=1000){
                System.out.println("Parcela "+ parcelaCarro + " R$ "+ valorParcela);
            }else {
                break;
            }
        }
    }
}
