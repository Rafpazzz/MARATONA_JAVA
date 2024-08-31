public class Aula04Operadores {
    public static void main(String[] args){
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;

        System.out.println("Valor= " + resultado);

        boolean isDesMaiorQueVinte = 10 > 20;
        boolean isDesMenorQueVinte = 10 < 20;
        System.out.println("isDesMaiorQueVinte= " + isDesMaiorQueVinte);
        System.out.println("isDesMenorQueVinte= " + isDesMenorQueVinte);

        double bonus = 1800;
        bonus %= 1000;
        System.out.println(bonus);
    }
}
