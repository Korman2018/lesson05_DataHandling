package com.epam.javaExternalLab.korostelevk.lesson05.task01.Demo;

import com.epam.javaExternalLab.korostelevk.lesson05.task01.HowOldAmI;

import java.time.LocalDateTime;

import static com.epam.javaExternalLab.korostelevk.lesson05.task01.DateUtils.DateUtils.*;

public class DemoServiceImpl implements DemoService {

    @Override
    public void howOldAmITests() {
        LocalDateTime birthday = LocalDateTime.of(1977, 4, 5, 3, 45, 10);

        System.out.println("howOldAmI test");
        HowOldAmI howOldAmI = new HowOldAmI(birthday);
        System.out.println("BirthDay: " + howOldAmI);

        System.out.println("Age in years: " + howOldAmI.inYears());
        System.out.println("Age in months " + howOldAmI.inMonths());
        System.out.println("Age in days " + howOldAmI.inDays());
        System.out.println("Age in hours " + howOldAmI.inHours());
        System.out.println("Age in minutes " + howOldAmI.inMinutes());
        System.out.println("Age in seconds " + howOldAmI.inSeconds());
    }

    @Override
    public void daysBetweenTests() {
        String dateOne = "10.07.2018";
        String dateTwo = "09.07.2017";

        System.out.println("\ndaysBetween test");
        System.out.println("Date one is " + dateOne);
        System.out.println("Date two is " + dateTwo);

        System.out.println("Days between date one and date two is " + daysBetween(dateOne, dateTwo));
    }

    @Override
    public void convertToDateTests() {
        String dateToConversion = "Friday, Aug 10, 2016 12:10:56 PM";
        System.out.println("\nconvertToDate test");
        System.out.println("Date to convert: " + dateToConversion);
        System.out.println("Converted date: " + convertToDate(dateToConversion));
    }

    @Override
    public void convertToIzhevskDateTimeTests() {
        System.out.println("\nconvertToIzhevskDateTime test");
        String dateToConversion = "2016-08-16T10:15:30+08:00";
        System.out.println("Date to convert: " + dateToConversion);
        System.out.println("Converted date: " + convertToIzhevskDateTime(dateToConversion));
    }
}
