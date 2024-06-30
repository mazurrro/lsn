package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> initialList;
        do {
            initialList = getData(sc);
        } while (initialList.isEmpty());

        sc.close();

        Set<Integer> sortedCollection = ListHelper.getDistinctAndSortedElements(initialList);
        int maxElement = ListHelper.getMaxElement(sortedCollection);
        int minElement = ListHelper.getMinElement(sortedCollection);

        //display data
        System.out.println(sortedCollection);
        System.out.println("count: "+initialList.size());
        System.out.println("distinct: "+sortedCollection.size());
        System.out.println("min: "+minElement);
        System.out.println("max: "+maxElement);

        System.out.println();
    }

    private static List<Integer> getData(Scanner sc) {
        System.out.println("Provide list of integers (seperated by space)");
        try {
            return Stream.of(sc.nextLine()
                            .trim()
                            .split(" "))
                    .filter(x -> !x.isEmpty())
                    .map(Integer::parseInt).collect(Collectors.toList());
        } catch (NumberFormatException ex) {
            System.out.println("Incorrect input!");
        }
        return Collections.emptyList();
    }

}