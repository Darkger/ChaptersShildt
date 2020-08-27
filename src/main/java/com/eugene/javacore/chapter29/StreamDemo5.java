package com.eugene.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone {
    String name;
    String phonenum;

    NamePhone(String n, String p) {
        name = n;
        phonenum = p;
    }
}

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry","555-5555","Larry@HerbShildt.com"));
        myList.add(new NamePhoneEmail("Djemys","555-4444","Djemys@HerbShildt.com"));
        myList.add(new NamePhoneEmail("Mary","555-3333","Mary@HerbShildt.com"));
        System.out.println("Исходные элементы списка myList: ");
        myList.stream().forEach(a->System.out.println(a.name+" "+a.phonenum+" "+a.email));
        System.out.println();
        Stream<NamePhone> nameAndPhone =myList.stream().filter(a->a.name.equals("Djemys")).map(a->new NamePhone(a.name,a.phonenum));
        nameAndPhone.forEach(a->System.out.println(a.name+" "+ a.phonenum));

    }
}
