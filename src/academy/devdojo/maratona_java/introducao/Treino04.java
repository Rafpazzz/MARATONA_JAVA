package academy.devdojo.maratona_java.introducao;

public class Treino04 {
    public static void main(String[] args) {
        int anoCasamento = 1986;
        int anoAtual = 2024;
        int bodas = anoAtual - anoCasamento;

        if (bodas == 25){
            System.out.println("Bodas de Prata");
        } if (bodas == 50) {
            System.out.println("Bodas de Ouro");
        } if (bodas == 75){
            System.out.println("bodas de Diamante");
        }else {
            System.out.println("O casal possue "+ bodas+" anos de casados");
        }
    }
}
