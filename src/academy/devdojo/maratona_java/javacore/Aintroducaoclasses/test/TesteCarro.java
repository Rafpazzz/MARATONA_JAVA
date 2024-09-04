package academy.devdojo.maratona_java.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona_java.javacore.Aintroducaoclasses.model.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro veiculo1 = new Carro();

        veiculo1.nome = "Corolla";
        veiculo1.modelo = 1234;
        veiculo1.ano = 2012;

        Carro veiculo2 = new Carro();

        veiculo2.nome = "Civic";
        veiculo2.modelo = 45321;
        veiculo2.ano = 2018;

        //veiculo1 = veiculo2;
        //veiculo1 faz referencia ao objeto de veiculo2.

        System.out.println(veiculo1.ano);
        System.out.println(veiculo1.nome);
        System.out.println(veiculo1.modelo);
        System.out.println("-------------------");
        System.out.println(veiculo2.modelo);
        System.out.println(veiculo2.ano);
        System.out.println(veiculo2.nome);
    }
}
