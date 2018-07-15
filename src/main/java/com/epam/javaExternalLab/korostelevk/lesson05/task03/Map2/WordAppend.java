package com.epam.javaExternalLab.korostelevk.lesson05.task03.Map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String s : strings) {
            if (map.containsKey(s)) {
                result.append(s);
                map.remove(s);
            } else {
                map.put(s, 1);
            }
        }
        return result.toString();
    }
}
