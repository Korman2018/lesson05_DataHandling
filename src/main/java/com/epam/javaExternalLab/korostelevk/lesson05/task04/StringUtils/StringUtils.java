package com.epam.javaExternalLab.korostelevk.lesson05.task04.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

        String regex = "(((^|\\s)(8|\\+7)-*\\s*\\(?\\s*3412\\s*\\)?-*\\s*)(\\d{6}|\\d{2}-\\d{2}-\\d{2}|\\d{3}-\\d{3}))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        List<Integer> list = new ArrayList<>();

        while (matcher.find()) {
            int end = matcher.end();
            if (source.length() == end || source.substring(end, end + 1).matches("\\s")) {
                list.add(matcher.start(5));
                list.add(matcher.start());
            }
        }

        StringBuilder sb = new StringBuilder(source);

        for (int i = list.size() - 1; i >= 0; i = i - 2) {
            sb.replace(list.get(i), list.get(i - 1), " ");
        }

        return sb.toString();
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
