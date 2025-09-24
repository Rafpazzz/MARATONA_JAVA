package academy.devdojo.maratona_java.Projetos.Projeto_01.view;

import academy.devdojo.maratona_java.Projetos.Projeto_01.Entity.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    public void salvarEmBanco(User user) {
        File file = new File("banco.txt");
        try(FileWriter fw = new FileWriter(file, true);BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(user.toString());
            bw.newLine();
        }catch(IOException e) {
            throw new RuntimeException("Não foi possivel acessar o arquivo");
        }
    }

}
