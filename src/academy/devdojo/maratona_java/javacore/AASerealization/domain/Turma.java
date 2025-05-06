package academy.devdojo.maratona_java.javacore.AASerealization.domain;

public class Turma {
    private String nome;

    public Turma(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Turma{");
        sb.append("nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
