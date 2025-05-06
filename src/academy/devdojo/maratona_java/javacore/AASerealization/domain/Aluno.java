package academy.devdojo.maratona_java.javacore.AASerealization.domain;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 6688919542800344558L;

    private long id;
    private transient Turma turma;
    private String nome;
    private transient String password; //esse atributo não sera serealizado
    private static String nomeEscola = "DevDojo"; //conteudos estaticos nao são serealizaveis, pois ele pertenec ao objeto nao a classe

    public Aluno(long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aluno{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", escola='").append(nomeEscola).append('\'');
        sb.append(", turma='").append(turma).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try{
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
