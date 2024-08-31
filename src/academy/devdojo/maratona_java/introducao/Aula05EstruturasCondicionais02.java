package academy.devdojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo ";
        String mensagemNaoDoar = "Ainda nao tenho condiçoes, mas  ainda vou ter";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

        double contacorrente = 4759.67;
        double contapouanca = 1000;
        boolean pissivelViagem = contacorrente >= 7500 || contapouanca >= 7500;


    }
}
