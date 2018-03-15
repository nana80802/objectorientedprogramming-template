package oop.pset4;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        LocalDateTime now = LocalDateTime.now();

        ZoneId vienna = ZoneId.of("Europe/Vienna");

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Madrid");
        objects.add("Copenhagen");
        objects.add("Stockholm");
        objects.add("Riga");
        objects.add("Tallinn");

        ZonedDateTime viennaTime = now.atZone(vienna);


        objects.forEach(e -> {
            ZoneId place = ZoneId.of("Europe/" + e);
            ZonedDateTime placeTime = viennaTime.withZoneSameInstant(place);
            System.out.println("Now in " + place + ": " + timeFormatter.format(placeTime));

        });

        System.out.println("Now in Vienna: " + timeFormatter.format(viennaTime));
    }
}
