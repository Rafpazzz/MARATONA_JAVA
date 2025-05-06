package academy.devdojo.maratona_java.javacore.AASerealization.test;

import academy.devdojo.maratona_java.javacore.AASerealization.domain.Aluno;
import academy.devdojo.maratona_java.javacore.AASerealization.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerealizacaoTest01 {
    public static void main(String[] args) {
        //vamos pegar um objeto em memorioa transformar ele em um arquivo e dps ler novamente
        //salvar um estado de um objeto e recuperar ele depois
        Aluno a1 = new Aluno(3333L, "Rafael", "12344");
        Turma t1 = new Turma("Maratona Java");
        a1.setTurma(t1);
        seralizar(a1);
        desSeralizar();
    }

    private static void seralizar(Aluno aluno) {
        Path path = Paths.get("pasta\\aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void desSeralizar() {
        Path path = Paths.get("pasta\\aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno)ois.readObject();
            System.out.println(aluno);
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
