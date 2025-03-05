package academy.devdojo.maratona_java.javacore.Oexception.exception.test;

import academy.devdojo.maratona_java.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try{
            logar();
        } catch (LoginInvalidoException e) {
           e.printStackTrace();
        }
    }

    private static void logar() throws  LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario:");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha:");
        String senhadigitada = teclado.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhadigitada)) {
            throw new LoginInvalidoException("Usuario ou senha Invalodos");
        }

        System.out.println("Usuario logado com sucesso");
    }
}
