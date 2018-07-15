package com.epam.javaExternalLab.korostelevk.lesson05.task02.CalculationUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class CalculatingUtils {

    public static BigDecimal countCircleArea(String radius) {
        try {
            BigDecimal radiusBig = new BigDecimal(radius);
            BigDecimal area = radiusBig.multiply(radiusBig).multiply(Pi.pi(50));
            return area.setScale(50, BigDecimal.ROUND_HALF_UP);
        } catch (NumberFormatException ex) {
            System.out.println("incorrect radius");
            ex.printStackTrace();
        }
        return null;
    }

    public static boolean compareSumOfTwoNumbers(String one, String two, String sum) {
        try {
            BigDecimal oneBig = parseToBigDecimalConsiderLocale(one);
            BigDecimal twoBig = parseToBigDecimalConsiderLocale(two);
            BigDecimal sumBig = parseToBigDecimalConsiderLocale(sum);

            return oneBig.add(twoBig).compareTo(sumBig) == 0;
        } catch (NumberFormatException ex) {
            System.out.println("incorrect number");
            ex.printStackTrace();
        }
        return false;
    }

    private static BigDecimal parseToBigDecimalConsiderLocale(String number) {
        try {
            DecimalFormat df = (DecimalFormat) NumberFormat.getInstance(Locale.getDefault());
            df.setParseBigDecimal(true);
            return (BigDecimal) df.parseObject(number);
        } catch (ParseException e) {
            System.out.println("does not match the locale");
            e.printStackTrace();
        }
        return null;
    }

    public static double maxOfThreeNumber(double one, double two, double three) {
        return max(max(one, two), three);
    }

    public static double minOfThreeNumber(double one, double two, double three) {
        return min(min(one, two), three);
    }
}
