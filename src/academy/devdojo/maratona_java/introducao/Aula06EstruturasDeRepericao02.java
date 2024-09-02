package academy.devdojo.maratona_java.introducao;

public class Aula06EstruturasDeRepericao02 {
    public static void main(String[] args) {
        int contPar = 0;

        while(contPar < 100 ){
            if (contPar % 2 == 0){
                System.out.println(contPar);
            }
            contPar += 1;
        }

        for(contPar=0;contPar<100;contPar++){
            if (contPar % 2 == 0){
                System.out.println(contPar);
            }
        }
    }
}
