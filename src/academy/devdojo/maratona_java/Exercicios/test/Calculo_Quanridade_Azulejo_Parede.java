package academy.devdojo.maratona_java.Exercicios.test;

import java.util.Scanner;

public class Calculo_Quanridade_Azulejo_Parede {
    public static void main(String[] args) {
        double alturaParede = 0;
        double larguraParede = 0;
        double alturaAzulejo = 0;
        double larguraAzulejo = 0;
        double areaParede = 0;
        double areaAzulejo = 0;
        double quantidadeAzulejo = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a altura da parede: ");
        alturaParede = input.nextDouble();

        System.out.print("Informe a largura da parede: ");
        larguraParede = input.nextDouble();

        System.out.print("Indforme a altura do azulejo: ");
        alturaAzulejo = input.nextDouble();

        System.out.print("Indforme a largura do azulejo: ");
        larguraAzulejo = input.nextDouble();

        areaParede = alturaParede * larguraParede;
        areaAzulejo = alturaAzulejo * larguraAzulejo;

        quantidadeAzulejo = areaParede / areaAzulejo;
        //quantidadeAzulejo = Math.ceil(areaParede / areaAzulejo); (divide e aredonda para cima)


      if(quantidadeAzulejo%2 == 1 || quantidadeAzulejo%2 == 0) {
           System.out.println("A quantidade de azulejo é "+quantidadeAzulejo);
       }else {
            quantidadeAzulejo++;
           System.out.println("A quantidade de azulejo é "+(int)quantidadeAzulejo);
      }

    }
}
