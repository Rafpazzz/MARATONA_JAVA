package academy.devdojo.maratona_java.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        int i = 0;
        idades[0]=21;
        idades[1]=12;
        idades[2]=22;

        while(i<=2){
            System.out.println(idades[i]);
            i++;
        }

        for(int a=0; a<=2; a++){
            System.out.println(idades[a]);
        }
    }
}
