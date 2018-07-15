package com.epam.javaExternalLab.korostelevk.lesson05.task02;

import com.epam.javaExternalLab.korostelevk.lesson05.task02.Demo.DemoService;
import com.epam.javaExternalLab.korostelevk.lesson05.task02.Demo.DemoServiceImpl;

public class Runner {
    public static void main(String[] args) {
        DemoService demoService = new DemoServiceImpl();
        demoService.countCircleAreaTests();
        demoService.compareSumOfTwoNumbersTests();
        demoService.maxOfThreeNumberTests();
        demoService.minOfThreeNumberTests();
    }
}
