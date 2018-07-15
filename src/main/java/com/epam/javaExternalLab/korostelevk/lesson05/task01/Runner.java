package com.epam.javaExternalLab.korostelevk.lesson05.task01;

import com.epam.javaExternalLab.korostelevk.lesson05.task01.Demo.DemoService;
import com.epam.javaExternalLab.korostelevk.lesson05.task01.Demo.DemoServiceImpl;

public class Runner {

    public static void main(String[] args) {
        DemoService demoService = new DemoServiceImpl();
        demoService.howOldAmITests();
        demoService.daysBetweenTests();
        demoService.convertToDateTests();
        demoService.convertToIzhevskDateTimeTests();
    }
}
