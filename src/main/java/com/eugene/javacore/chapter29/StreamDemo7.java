package com.eugene.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail1 {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail1(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone1 {
    String name;
    String phonenum;

    NamePhone1(String n, String p) {
        name = n;
        phonenum = p;
    }
}

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail1> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail1("Larry", "555-5555", "Larry@HerbShildt.com"));
        myList.add(new NamePhoneEmail1("Djemys", "555-4444", "Djemys@HerbShildt.com"));
        myList.add(new NamePhoneEmail1("Mary", "555-3333", "Mary@HerbShildt.com"));
        System.out.println("Исходные элементы списка myList: ");
        myList.stream().forEach(a -> System.out.println(a.name + " " + a.phonenum + " " + a.email));
        System.out.println();
        Stream<NamePhone1> nameAndPhone =myList.stream().map(a->new NamePhone1(a.name,a.phonenum));
        List<NamePhone1> npList = nameAndPhone.collect(Collectors.toList());
        for( NamePhone1 e : npList)
        {
            System.out.println(e.name+ " "+e.phonenum);
        }
        nameAndPhone = myList.stream().map(e->new NamePhone1(e.name,e.phonenum));
        Set<NamePhone1> npSet = nameAndPhone.collect(Collectors.toSet());
        for(NamePhone1 e: npSet)
        {
            System.out.println(e.name+e.phonenum);
        }
    }
}