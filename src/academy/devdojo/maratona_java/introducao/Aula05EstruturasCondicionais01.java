package academy.devdojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 18;

        if(idade < 15){
            System.out.println("Categoria infantil");
        }if(idade <18 && idade >= 15){
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria adulto");
        }
    }
}