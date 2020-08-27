package com.eugene.javacore.chapter29;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Betta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Xy");
        myList.add("Omega");
        Stream<String> myStream = myList.stream();
        Spliterator<String> splitItr= myStream.spliterator();
        Spliterator<String> splitr2= splitItr.trySplit();
        if(splitr2!=null)
            splitr2.forEachRemaining(n->System.out.println(n));
    }
}
