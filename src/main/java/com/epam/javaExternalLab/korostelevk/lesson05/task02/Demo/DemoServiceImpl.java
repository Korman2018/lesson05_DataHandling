package com.epam.javaExternalLab.korostelevk.lesson05.task02.Demo;

import static com.epam.javaExternalLab.korostelevk.lesson05.task02.CalculationUtils.CalculatingUtils.*;

public class DemoServiceImpl implements DemoService {
    @Override
    public void countCircleAreaTests() {
        System.out.println("\ncountCircleArea Tests");
        String radius = "123";
        System.out.println("Radius = " + radius);
        System.out.println("Circle area = " + countCircleArea(radius));
    }

    @Override
    public void compareSumOfTwoNumbersTests() {
        System.out.println("\ncompareSumOfTwoNumbers tests");

        String one = "0.015";
        String two = "1.005123";
        String sum = "1.020123";
        System.out.print(sumHelper(one, two, sum));
        System.out.println(compareSumOfTwoNumbers(one, two, sum));

        one = "0,00001";
        two = "0,000091";
        sum = "0,000101";
        System.out.print(sumHelper(one, two, sum));
        System.out.println(compareSumOfTwoNumbers(one, two, sum));
    }

    private String sumHelper(String one, String two, String sum) {
        StringBuilder sb = new StringBuilder();
        sb.append(one).append(" + ").append(two).append(" = ").append(sum).append("  is ");
        return sb.toString();
    }

    @Override
    public void maxOfThreeNumberTests() {
        System.out.println("\nmaxOfThreeNumber tests");

        double one = 0.0000051;
        double two = 0.0000052;
        double three = 0.0000053;

        System.out.print(minMaxHelper(one, two, three));
        System.out.format("  max is   %.10f%n", maxOfThreeNumber(one, two, three));
    }

    @Override
    public void minOfThreeNumberTests() {
        System.out.println("\nminOfThreeNumber tests");

        double one = 0.0000000011;
        double two = 0.000000001;
        double three = -0.0000001;

        System.out.print(minMaxHelper(one, two, three));
        System.out.format("  min is  %.10f%n", minOfThreeNumber(one, two, three));
    }

    private static String minMaxHelper(double one, double two, double three) {
        StringBuilder sb = new StringBuilder("numbers: ");
        sb.append(formNumber(one)).append(", ").append(formNumber(two)).append(", ").append(formNumber(three));
        return sb.toString();
    }

    private static String formNumber(double number) {
        return String.format(" %.10f", number);
    }
}
