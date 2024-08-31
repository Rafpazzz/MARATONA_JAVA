package academy.devdojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.7/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.5/100;
        double valorImposto;

        if(salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        }else if(salarioAnual >=34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("Voce paragara um valor de "+ valorImposto+" reais de imposto");
    }
}
