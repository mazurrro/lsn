package org.example;

import java.util.*;

public class ListHelper {

    public static Set<Integer> getDistinctAndSortedElements(List<Integer> list) {
        return new TreeSet<>(list);
    }

    public static Integer getMaxElement(List<Integer> list) {
        return Collections.max(list);
    }

    public static Integer getMinElement(List<Integer> list) {
        return Collections.min(list);
    }
}


