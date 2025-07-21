package academy.devdojo.maratona_java.javacore.ZZDoptional.repository;

import academy.devdojo.maratona_java.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangaList = List.of(new Manga("Naruto", 11, 1), new Manga("Dragon Ball Z", 14, 2), new Manga("Bleach", 2, 3));

    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Manga> findByid(int id) {
        return findBy(m -> m.getId().equals(id));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;

        for (Manga m : mangaList) {
            if (predicate.test(m)) {
                found = m;
            }
        }

        return Optional.ofNullable(found);
    }
}
