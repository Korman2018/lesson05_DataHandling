package com.epam.javaExternalLab.korostelevk.lesson05.task03.Logic2;

/**
 * Given three ints, a b c, one of them is small, one is medium and one is large.
 * Return true if the three values are evenly spaced, so the difference between
 * small and medium is the same as the difference between medium and large.
 */
public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        return (a - b == b - c) || (a - b == c - a) || (a - c == c - b);
    }
}
