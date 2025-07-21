package academy.devdojo.maratona_java.javacore.ZZDoptional.domain;

import java.util.Objects;

public class Manga {
    private String title;
    private int count;
    private Integer id;

    public Manga(String title, int count, Integer id) {
        this.title = title;
        this.count = count;
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Manga{");
        sb.append("title='").append(title).append('\'');
        sb.append(", count=").append(count);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public Integer getId() {
        return id;
    }
}
