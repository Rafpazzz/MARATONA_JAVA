package academy.devdojo.maratona_java.introducao;

public class Aula06EstruturasDeRepericao {
    public static void main(String[] args) {

        int count = 0;

        while(count<=11){
            System.out.println(count);
            count += 1;
        }

        count = 0;

        do{
            System.out.println("Executa ante do while, obrigatiramentre. " + count);
            count++;
        }while(count <10);

        count = 0;

        for(int i=0;i <=10;i++){
            System.out.println("For " + i);
        }
    }
}
