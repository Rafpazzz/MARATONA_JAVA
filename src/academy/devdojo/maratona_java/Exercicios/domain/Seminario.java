package academy.devdojo.maratona_java.Exercicios.domain;

public class Seminario {
    private String nome;
    private Estudantes[] estudante;
    private Professores[] prof;
    private Local local;

    public Seminario(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("--------SEMINARIO-------");
        System.out.println("Titulo: "+ this.nome);
        if(local == null) {
            System.out.println("Espere a confirmação do local.");
            return;
        } else{
            System.out.println("Local: " + local.getNome());
        }

        if(prof == null) {
            System.out.println("Nenhum professor ira palestrar. Entao nao havera palestra.");
            return;
        }else {
            for (Professores professores : prof) {
                System.out.print(professores.getNome() + " ");
                System.out.println(professores.getEspecialidade());
            }
        }

        if(estudante==null) {
            System.out.println("Nenhum aluno presente");
        }else {
            for (Estudantes estudantes : estudante) {
                System.out.print("Nome: " + estudantes.getNome() + " idade: ");
                System.out.println(estudantes.getIdade());
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estudantes[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudantes[] estudante) {
        this.estudante = estudante;
    }

    public Professores[] getProf() {
        return prof;
    }

    public void setProf(Professores[] prof) {
        this.prof = prof;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
