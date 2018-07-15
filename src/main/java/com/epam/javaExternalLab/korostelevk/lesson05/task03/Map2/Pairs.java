package com.epam.javaExternalLab.korostelevk.lesson05.task03.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of non-empty strings, create and return a Map<String, String> as follows:
 * for each string add its first character as a key with its last character as the value.
 */
public class Pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            map.put(s.substring(0, 1), s.substring(s.length() - 1, s.length()));
        }
        return map;
    }
}
