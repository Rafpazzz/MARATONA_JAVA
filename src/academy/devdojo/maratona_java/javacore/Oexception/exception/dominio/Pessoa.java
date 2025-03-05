package academy.devdojo.maratona_java.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("salvando Pessoa");
    }
}
