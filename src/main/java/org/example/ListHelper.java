package org.example;

import java.util.*;

public class ListHelper {

    public static Set<Integer> getDistinctAndSortedElements(List<Integer> list) {
        return new TreeSet<>(list);
    }

    public static Integer getMaxElement(Set<Integer> set) {
        return Collections.max(set);
    }

    public static Integer getMinElement(Set<Integer> set) {
        return Collections.min(set);
    }
}


