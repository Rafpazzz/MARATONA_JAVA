package academy.devdojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        int diaSemana = 3;

        switch (diaSemana){
            case 1:
                System.out.println("Hoje é domingo, considerado final de samena.");
                break;
            case 2:
                System.out.println("Hoje é segunda, considerado dia util da semana.");
                break;
            case 3:
                System.out.println("Hoje é terça, considerado dia util da semana.");
                break;
            case 4:
                System.out.println("Hoje é quarta, considerado dia util da semana.");
                break;
            case 5:
                System.out.println("Hoje é quinta, considerado dia util da semana.");
                break;
            case 6:
                System.out.println("Hoje é sexta, considerado dia util da semana.");
                break;
            case 7:
                System.out.println("Hoje é sabado, considerado final de samena.");
                break;
            default :
                System.out.println("Valor invalido");
                break;
        }
    }
}
