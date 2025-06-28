package academy.devdojo.maratona_java.javacore.ZZClambdas.domain;

public class Anime {
    private String title;
    private Integer episodes;

    public Anime(String title, Integer episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Anime{");
        sb.append("title='").append(title).append('\'');
        sb.append(", quantity=").append(episodes);
        sb.append('}');
        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public Integer getEpisodes() {
        return episodes;
    }
}
