package com.eugene.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Исходный список: " + myList);
        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent())
            System.out.println("Min znachenie:" + minVal.get());
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent())
            System.out.println("max val:" + maxVal.get());
        Stream<Integer> sortStream = myList.stream().sorted();
        System.out.println("Sort data stream: ");
        sortStream.forEach(n -> System.out.println(n + " "));
        System.out.println();
        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> (n % 2) == 1);
        System.out.println("Nexhetnie znacheniya: ");
        oddVals.forEach(n -> System.out.println(n + " "));
        oddVals = myList.stream().filter(n -> (n % 2) == 1)
                .filter(n -> n > 5);
oddVals.forEach(n->System.out.println(n+" "));
System.out.println();

    }
}
