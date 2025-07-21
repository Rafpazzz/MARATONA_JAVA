package academy.devdojo.maratona_java.javacore.ZZDoptional.test;

import academy.devdojo.maratona_java.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratona_java.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

import static academy.devdojo.maratona_java.javacore.ZZDoptional.repository.MangaRepository.findByTitle;
import static academy.devdojo.maratona_java.javacore.ZZDoptional.repository.MangaRepository.findByid;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> byTitle = findByTitle("Naruto");
        byTitle.ifPresent(m -> m.setTitle(m.getTitle().toUpperCase()));
        System.out.println(byTitle);

        Manga byid = findByid(5).orElseThrow(IllegalArgumentException::new);

        findByTitle("NoobPsycho").orElse(new Manga("NoobPsycho", 12, 4));
    }

}
