package academy.devdojo.maratona_java.Exercicios.test;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        int[] eventos =  {10,-20,61,-15};
        int n = 4;
        System.out.println(getBattery(eventos, n));
    }

    public static int getBattery(int[] eventos, int n) {
        int cargaInicial = 50;
        for(int i = 0; i<n; i++) {
            System.out.print("Evento[" + i +"] -> ");
            if(eventos[i] > 0) {
                System.out.print(eventos[i] +" minutos carregando -> "+ cargaInicial);
                cargaInicial += eventos[i];
                if(cargaInicial>100){
                    cargaInicial = 100;
                }
                System.out.println(" + " + eventos[i] +"% = " + cargaInicial+ "%.");
            }else if(eventos[i] < 0) {
                System.out.print(eventos[i] + " minutos jogando -> "+ cargaInicial);
                cargaInicial += eventos[i];
                System.out.println(" + " + eventos[i] +"% = " + cargaInicial+ "%.");
            }

        }

        return cargaInicial;
    }
}
