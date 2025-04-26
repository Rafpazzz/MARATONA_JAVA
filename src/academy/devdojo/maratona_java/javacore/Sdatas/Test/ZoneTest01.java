package academy.devdojo.maratona_java.javacore.Sdatas.Test;

import java.time.*;
import java.util.Map;
//trabalhar com zonas e fusos
public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneId);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(zoneId);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(zoneId);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset offset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offset);
        System.out.println(offsetDateTime );


    }
}
