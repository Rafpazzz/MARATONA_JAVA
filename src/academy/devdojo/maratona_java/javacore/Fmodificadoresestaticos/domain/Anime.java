package academy.devdojo.maratona_java.javacore.Fmodificadoresestaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    /*
    * 0 - O bloco de inicialização estatico é executado quandi a JVM carrega a classe
    * 1 - Alocand ioespaço de memoria pro objeto
    * 2 - Cada atributo é criado e inicalizado com valores default  ou oq foi instanciado
    * 3 - bloco de inicialização executado
    * 4 - Constreutor executado
    * */

    static {
        System.out.println("Dentro do bloco de incialização estatico 1");
        episodios = new int[100];
        for(int i = 0; i< episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de incialização estatico 2");

    }

    static {
        System.out.println("Dentro do bloco de incialização estatico 3");
    }

    {
        System.out.println("Dentro do bloco de incialização não estatico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio = 0; episodio<=Anime.episodios.length; episodio++) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
