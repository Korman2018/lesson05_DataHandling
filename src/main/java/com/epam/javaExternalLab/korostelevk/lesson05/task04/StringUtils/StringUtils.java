package com.epam.javaExternalLab.korostelevk.lesson05.task04.StringUtils;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtils {

    public static String convertSentenceToWordsSequence(String string) {
        return Stream.of(string.split("(U?)[\\p{Punct}\\s]+"))
                .map(String::toLowerCase).collect(Collectors.joining("\n"));
    }

    public static String findMaxWord(String string) {
        return findMinMaxHelper(string, Comparator.comparingInt(String::length));
    }

    public static String findMinWord(String string) {
        return findMinMaxHelper(string, (s1, s2) -> s2.length() - s1.length());
    }

    private static String findMinMaxHelper(String string, Comparator<String> comparator) {
        return Stream.of(string.split("\\n")).max(comparator).orElse("");
    }

    public static String removeIzhevskPrefix(String source) {
        String regex = "(^|\\s)(8|\\+7) *\\(? *3412(\\)?)";
        return source.replaceAll(regex, "");
    }

    public static String convertTemplateToText(String text, Map<String, String> converter) {
        if (text == null) {
            return null;
        }

        String temp = text;

        for (Map.Entry<String, String> entry : converter.entrySet()) {
            temp = temp.replaceAll("\\$" + entry.getKey(), entry.getValue());
        }
        return temp;
    }
}
