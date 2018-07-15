package com.epam.javaExternalLab.korostelevk.lesson05.task03.Logic2;

import static java.lang.Math.*;

/**
 * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
 * while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num)
 * computes the absolute value of a number.
 */
public class CloseFar {
    public boolean closeFar(int a, int b, int c) {
        return abs(a - b) <= 1 && abs(b - c) >= 2 && abs(a - c) >= 2
                || abs(a - c) <= 1 && abs(b - c) >= 2 && abs(a - b) >= 2;
    }
}
