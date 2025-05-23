package Java_Collections.domain;

import java.util.Objects;

public class Animes implements Comparable<Animes>{
    private Long id;
    private String nome;
    private double preco;

    public Animes(Long id, String nome, double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);// metodo para lançar uma exceção se o valor passado no parametro for nulo.
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Animes o) {
        //retornar negativo se o this for menor que o
        //se this == o retorna 0
        //se this > o retorna positivo
//        if(this.id < o.getId()) {
//            return -1;
//        }else if(this.id.equals(o.getId())) {
//            return 0;
//        }else {
//            return 1;
//        }
//      return Double.valueOf(preco).compareTo(o.getPreco());
//        return Double.compare(preco, o.getPreco());
        //return this.getId().compareTo(o.getId());
        return this.nome.compareTo(o.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animes animes = (Animes) o;
        return Double.compare(preco, animes.preco) == 0 && Objects.equals(id, animes.id) && Objects.equals(nome, animes.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animes{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
