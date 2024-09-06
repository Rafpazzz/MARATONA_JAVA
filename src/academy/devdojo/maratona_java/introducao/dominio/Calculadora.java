package academy.devdojo.maratona_java.introducao.dominio;

public class Calculadora {
    public double soma(double num1, double num2){
        double somar;
        somar = num1 + num2;
        return somar;
    }
    public double subrati(double num1, double num2){
        double subitrair;
        subitrair = num1 - num2;
        return subitrair;
    }
    public double multiplica(double num1, double num2){
        double multiplica;
        multiplica = num1 * num2;
        return multiplica;
    }
    public double divide(double num1, double num2){
        double dividir;
        dividir = num1 / num2;
        return dividir;
    }
    public double restodiv(double num1, double num2){
        double restodiv;
        restodiv = num1 % num2;
        return restodiv;
    }

}
