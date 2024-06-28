package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListHelper {

    public static Set<Integer> getDistinctElements(List<Integer> list) {
        return new HashSet<>(list);
    }

    public static List<Integer> sortElements(List<Integer> list) {
        // sort elements O(n log n)
        Collections.sort(list);
        return list;
    }

    public static Integer getMaxElement(List<Integer> list) {
        return Collections.max(list);
    }

    public static Integer getMinElement(List<Integer> list) {
        return Collections.min(list);
    }
}


