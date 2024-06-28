package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> initialList = getData(sc);

        Set<Integer> distinctElements = ListHelper.getDistinctElements(initialList);
        List<Integer> sortedList = ListHelper.sortElements(new ArrayList<>(distinctElements));
        int maxElement = ListHelper.getMaxElement(sortedList);
        int minElement = ListHelper.getMinElement(sortedList);

        //display data
        System.out.println(sortedList);
        System.out.println("count: "+initialList.size());
        System.out.println("distinct: "+sortedList.size());
        System.out.println("min: "+minElement);
        System.out.println("max: "+maxElement);
    }

    private static List<Integer> getData(Scanner sc) {
        boolean incorrectInput = true;
        List<Integer> initialList = new ArrayList<>();
        while(incorrectInput){
            System.out.println("Provide list of integers (seperated by space)");
            incorrectInput = false;
            try {
                return Stream.of(sc.nextLine()
                                .trim()
                                .split(" "))
                        .filter(x -> !x.isEmpty())
                        .map(Integer::parseInt).collect(Collectors.toList());
            } catch (NumberFormatException ex) {
                incorrectInput = true;
            }
        }
        return Collections.emptyList();
    }

}