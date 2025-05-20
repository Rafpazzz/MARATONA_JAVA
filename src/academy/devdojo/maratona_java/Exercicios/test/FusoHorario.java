package academy.devdojo.maratona_java.Exercicios.test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRulesException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FusoHorario {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Map<String, ZoneId> zonas = new HashMap<>();
        zonas.put("ACT", ZoneId.of("Australia/Darwin"));
        zonas.put("AET", ZoneId.of("Australia/Sydney"));
        zonas.put("AGT", ZoneId.of("America/Argentina/Buenos_Aires"));
        zonas.put("ART", ZoneId.of("Africa/Cairo"));
        zonas.put("AST", ZoneId.of("America/Anchorage"));
        zonas.put("BET", ZoneId.of("America/Sao_Paulo"));
        zonas.put("BST", ZoneId.of("Asia/Dhaka"));
        zonas.put("CAT", ZoneId.of("Africa/Harare"));
        zonas.put("CNT", ZoneId.of("America/St_Johns"));
        zonas.put("CST", ZoneId.of("America/Chicago"));
        zonas.put("CTT", ZoneId.of("Asia/Shanghai"));
        zonas.put("EAT", ZoneId.of("Africa/Addis_Ababa"));
        zonas.put("ECT", ZoneId.of("Europe/Paris"));
        zonas.put("IET", ZoneId.of("America/Indiana/Indianapolis"));
        zonas.put("IST", ZoneId.of("Asia/Kolkata"));
        zonas.put("JST", ZoneId.of("Asia/Tokyo"));
        zonas.put("MIT", ZoneId.of("Pacific/Apia"));
        zonas.put("NET", ZoneId.of("Asia/Yerevan"));
        zonas.put("NST", ZoneId.of("Pacific/Auckland"));
        zonas.put("PLT", ZoneId.of("Asia/Karachi"));
        zonas.put("PNT", ZoneId.of("America/Phoenix"));
        zonas.put("PRT", ZoneId.of("America/Puerto_Rico"));
        zonas.put("PST", ZoneId.of("America/Los_Angeles"));
        zonas.put("SST", ZoneId.of("Pacific/Guadalcanal"));
        zonas.put("VST", ZoneId.of("Asia/Ho_Chi_Minh"));

        try{
            System.out.println("ACT - Australia/Darwin\n" +
                    "AET - Australia/Sydney\n" +
                    "AGT - America/Argentina/Buenos_Aires\n" +
                    "ART - Africa/Cairo\n" +
                    "AST - America/Anchorage\n" +
                    "BET - America/Sao_Paulo\n" +
                    "BST - Asia/Dhaka\n" +
                    "CAT - Africa/Harare\n" +
                    "CNT - America/St_Johns\n" +
                    "CST - America/Chicago\n" +
                    "CTT - Asia/Shanghai\n" +
                    "EAT - Africa/Addis_Ababa\n" +
                    "ECT - Europe/Paris\n" +
                    "IET - America/Indiana/Indianapolis\n" +
                    "IST - Asia/Kolkata\n" +
                    "JST - Asia/Tokyo\n" +
                    "MIT - Pacific/Apia\n" +
                    "NET - Asia/Yerevan\n" +
                    "NST - Pacific/Auckland\n" +
                    "PLT - Asia/Karachi\n" +
                    "PNT - America/Phoenix\n" +
                    "PRT - America/Puerto_Rico\n" +
                    "PST - America/Los_Angeles\n" +
                    "SST - Pacific/Guadalcanal\n" +
                    "VST - Asia/Ho_Chi_Minh");
            System.out.print("Informe o local que voce que calcular o fuso: ");
            String zone = r.nextLine().toUpperCase();
            Instant instantNow = Instant.now();
            ZonedDateTime dataHora = instantNow.atZone(zonas.get(zone));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss z");
            String formatada = dataHora.format(formatter);
            System.out.println(formatada);

        }catch (ZoneRulesException e) {
            e.printStackTrace();
        }

    }
}
