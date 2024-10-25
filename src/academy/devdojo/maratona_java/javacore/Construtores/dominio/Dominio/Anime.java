package academy.devdojo.maratona_java.javacore.Construtores.dominio.Dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    public Anime(String nome){
        this();
        this.nome = nome;
    }

    public Anime(String nome, String estudio){
        this();
        this.nome = nome;
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do ocntrutor");
    }

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        /*  this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;*/
        this.genero = genero;
    }

    public void imprime(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodio: " + this.episodios);
        System.out.println("Anime: " + this.nome);
        System.out.println("Genero: " + this.genero);
        System.out.println("Estudio: " + this.estudio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }
}
