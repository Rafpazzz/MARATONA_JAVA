package academy.devdojo.maratona_java.Exercicios.chat.client;

import academy.devdojo.maratona_java.Exercicios.domain.Local;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.time.LocalDate;

public class ClientTCPBasic {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 3232);
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
            LocalDate date = (LocalDate)in.readObject();
            JOptionPane.showMessageDialog(null, "Data recebida pelo servidor: "+ date.toString());
            in.close();
            System.out.println("Conexao encerrada");
        }catch(IOException | ClassNotFoundException e) {
            throw new RuntimeException("Error: "+e.getMessage());
        }
    }
}
