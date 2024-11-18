package academy.devdojo.maratona_java.javacore.Hheranca.test;

import academy.devdojo.maratona_java.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratona_java.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratona_java.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setCep("1234-464");
        endereco1.setRua("Rua das larangeiras");

        Pessoa pessoa1 = new Pessoa("Rafel", 12345676);
        pessoa1.setNome("Luffy");
        pessoa1.setCPF(1234566787);
        pessoa1.setEndereco(endereco1);

        pessoa1.imprime();

        Funcionario funcionario1 = new Funcionario("rafael", 12324534);
        //funcionario1.setNome("Zoro");
        // funcionario1.setCPF(1987654329);
        funcionario1.setEndereco(endereco1);
        funcionario1.setSalario(4567.3);
        System.out.println("---------------");
        funcionario1.imprime();
    }
}
