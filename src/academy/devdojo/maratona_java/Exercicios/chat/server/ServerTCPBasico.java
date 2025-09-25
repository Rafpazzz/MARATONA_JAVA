package academy.devdojo.maratona_java.Exercicios.chat.server;

import academy.devdojo.maratona_java.Exercicios.chat.client.ClientTCPBasic;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.Date;

public class ServerTCPBasico {
    private static final int porta = 3232;

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(porta);
            System.out.println("Servido ouvindo a porta " + porta);
            while(true) {
                Socket cliente = server.accept();
                System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
                ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                saida.flush();
                saida.writeObject(LocalDate.now());
                saida.close();
            }
        }catch(IOException e) {
            throw new RuntimeException("Error: "+e.getMessage());
        }
    }

}
