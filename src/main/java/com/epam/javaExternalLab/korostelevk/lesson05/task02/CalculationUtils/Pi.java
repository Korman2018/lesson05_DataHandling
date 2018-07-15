package com.epam.javaExternalLab.korostelevk.lesson05.task02.CalculationUtils;

import java.math.BigDecimal;

import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.ROUND_HALF_UP;

// вычисляем Pi сами с нужной точностью, хотя в принципе можно было захардкодить
public class Pi {
    private static final BigDecimal TWO = new BigDecimal(2);
    private static final BigDecimal FOUR = new BigDecimal(4);

    // чтобы нельзя было создать экземпляр
    private Pi() {
    }

    // Gauss-Legendre Algorithm
    public static BigDecimal pi(final int scale) {
        BigDecimal a = ONE;
        BigDecimal b = ONE.divide(sqrt(TWO, scale), scale, ROUND_HALF_UP);
        BigDecimal t = BigDecimal.valueOf(0.25);
        BigDecimal x = ONE;
        BigDecimal y;

        while (!a.equals(b)) {
            y = a;
            a = a.add(b).divide(TWO, scale, ROUND_HALF_UP);
            b = sqrt(b.multiply(y), scale);
            t = t.subtract(x.multiply(y.subtract(a).multiply(y.subtract(a))));
            x = x.multiply(TWO);
        }
        return a.add(b).multiply(a.add(b)).divide(t.multiply(FOUR), scale, ROUND_HALF_UP);
    }

    // the Babylonian square root method (Newton's method)
    private static BigDecimal sqrt(BigDecimal A, final int SCALE) {
        BigDecimal one = new BigDecimal(0);
        BigDecimal two = BigDecimal.valueOf(Math.sqrt(A.doubleValue()));

        while (!one.equals(two)) {
            one = two;
            two = A.divide(one, SCALE, ROUND_HALF_UP);
            two = two.add(one);
            two = two.divide(TWO, SCALE, ROUND_HALF_UP);
        }
        return two;
    }
}