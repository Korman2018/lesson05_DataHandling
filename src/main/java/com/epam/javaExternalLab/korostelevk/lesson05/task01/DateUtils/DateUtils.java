package com.epam.javaExternalLab.korostelevk.lesson05.task01.DateUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

import static java.lang.Math.abs;
import static java.time.temporal.ChronoUnit.DAYS;

public class DateUtils {

    private static final String MESSAGE = "This date format is not allowed";

    public static long daysBetween(String dateOne, String dateTwo) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate one = LocalDate.parse(dateOne, formatter);
            LocalDate two = LocalDate.parse(dateTwo, formatter);

            return abs(DAYS.between(one, two));
        } catch (DateTimeParseException ex) {
            System.out.println(MESSAGE);
            ex.printStackTrace();
        }
        return 0;
    }

    public static String convertToDate(String date) {
        try {
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(", MMM dd, yyyy hh:mm:ss a", Locale.ENGLISH);
            // выкидываем из строки с датой день недели
            LocalDate convertedDate = LocalDate.parse(date.substring(date.indexOf(',')), inputFormatter);
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            return convertedDate.format(outputFormatter);
        } catch (DateTimeParseException | StringIndexOutOfBoundsException ex) {
            System.out.println(MESSAGE);
            ex.printStackTrace();
        }
        return null;
    }

    public static String convertToIzhevskDateTime(String date) {
        try {
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(date);
            zonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("+04:00"));

            return zonedDateTime.toString();
        } catch (DateTimeParseException ex) {
            System.out.println(MESSAGE);
            ex.printStackTrace();
        }
        return null;
    }
}
