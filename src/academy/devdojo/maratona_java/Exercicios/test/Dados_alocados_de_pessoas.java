package academy.devdojo.maratona_java.Exercicios.test;

import academy.devdojo.maratona_java.Exercicios.domain.Pessoa;

public class Dados_alocados_de_pessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("rafael", 1.63, 'M');
        Pessoa p2 = new Pessoa("ana", 1.54, 'F');
        Pessoa p3 = new Pessoa("pedro", 1.73, 'M');
        Pessoa p4 = new Pessoa("natanal", 1.83, 'M');
        Pessoa p5 = new Pessoa("bia", 1.93, 'F');
        Pessoa p6 = new Pessoa("julia", 1.90, 'F');
        Pessoa p7 = new Pessoa("joao", 1.6, 'M');
        Pessoa p8 = new Pessoa("alcir", 2, 'M');
        Pessoa p9 = new Pessoa("maria", 1.45, 'F');
        Pessoa p10 = new Pessoa("carol", 1.78, 'F');

        Pessoa [] pessoas = {p1, p2,p3,p4,p5,p6,p7,p8,p9,p10};

        double maiorAltura = 0;
        double menorAltura = 0;
        double mediaAlturaHomem = 0;
        int contHomens = 0;
        int numeroMulher = 0;

        for(int i = 0; i<10; i++) {
            if(maiorAltura == 0 && menorAltura == 0){
                maiorAltura = pessoas[i].getAltura();
                menorAltura = pessoas[i].getAltura();
            }else{
                if(pessoas[i].getAltura() > maiorAltura){
                    maiorAltura = pessoas[i].getAltura();
                }else if(pessoas[i].getAltura() < menorAltura){
                    menorAltura = pessoas[i].getAltura();
                }
            }
        }

        for(int i = 0; i<10; i++) {
            if(pessoas[i].getSexo() == 'M') {
                mediaAlturaHomem =+ pessoas[i].getAltura();
                contHomens++;
            }
        }

        for(int i = 0; i<10; i++) {
            if(pessoas[i].getSexo() == 'F') {
                numeroMulher++;
            }
        }

        System.out.println("A maior altura é "+maiorAltura+" e a menor altura é "+menorAltura);
        System.out.println("A media da altura dos homens é "+ mediaAlturaHomem/contHomens);
        System.out.println("O numero de mulheres é "+ numeroMulher);
    }
}
