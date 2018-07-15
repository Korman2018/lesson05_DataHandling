package com.epam.javaExternalLab.korostelevk.lesson05.task01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.*;

public class HowOldAmI {

    private LocalDateTime birthday;

    public HowOldAmI(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public HowOldAmI(int day, int month, int year, int hour, int minute, int seconds) {
        birthday = LocalDateTime.of(year, month, day, hour, minute, seconds);
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public long inSeconds() {
        return SECONDS.between(birthday, LocalDateTime.now());
    }

    public long inMinutes() {
        return MINUTES.between(birthday, LocalDateTime.now());
    }

    public long inHours() {
        return HOURS.between(birthday, LocalDateTime.now());
    }

    public long inDays() {
        return DAYS.between(birthday, LocalDateTime.now());
    }

    public long inMonths() {
        return MONTHS.between(birthday, LocalDateTime.now());
    }

    public long inYears() {
        return YEARS.between(birthday, LocalDateTime.now());
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");
        return birthday.format(formatter);
    }
}
