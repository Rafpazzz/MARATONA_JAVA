package academy.devdojo.maratona_java.javacore.Jmodificadorfinal.domain;

public final class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();
    //a referencia que eu tenho pra esse comprador nao pode ser alterada.


    @Override
    public String toString() {
        return nome;
    }

    public  void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
