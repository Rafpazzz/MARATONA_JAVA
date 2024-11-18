package academy.devdojo.maratona_java.javacore.Lcalssesabstratas.test;

import academy.devdojo.maratona_java.javacore.Lcalssesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratona_java.javacore.Lcalssesabstratas.domain.Funcionario;
import academy.devdojo.maratona_java.javacore.Lcalssesabstratas.domain.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Nami", 3000);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Rafael", 7000);

        System.out.println(desenvolvedor1);
        System.out.println(gerente1);
        gerente1.imprime();
        desenvolvedor1.imprime();
        gerente1.mostra();
    }
}
