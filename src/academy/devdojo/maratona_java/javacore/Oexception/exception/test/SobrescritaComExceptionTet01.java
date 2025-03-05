package academy.devdojo.maratona_java.javacore.Oexception.exception.test;

import academy.devdojo.maratona_java.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratona_java.javacore.Oexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTet01{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}
