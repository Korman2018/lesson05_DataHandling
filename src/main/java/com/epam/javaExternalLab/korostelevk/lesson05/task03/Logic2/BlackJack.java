package com.epam.javaExternalLab.korostelevk.lesson05.task03.Logic2;

/**
 * Given 2 int values greater than 0, return whichever value is nearest
 * to 21 without going over. Return 0 if they both go over.
 */
public class BlackJack {
    public int blackjack(int a, int b) {
        a = a > 21 ? 0 : a;
        b = b > 21 ? 0 : b;
        return a > b ? a : b;
    }
}
