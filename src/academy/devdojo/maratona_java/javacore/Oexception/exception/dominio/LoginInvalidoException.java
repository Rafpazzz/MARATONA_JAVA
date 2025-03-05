package academy.devdojo.maratona_java.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login Invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
