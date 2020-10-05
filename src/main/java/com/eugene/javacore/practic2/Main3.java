package com.eugene.javacore.practic2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

class FizzBuzz {

    Semaphore semaphore1 = new Semaphore(1);
    Semaphore semaphore2 = new Semaphore(0);
    Semaphore semaphore3 = new Semaphore(0);
    Semaphore semaphore4 = new Semaphore(0);
    int size;
    ArrayList<String> list = new ArrayList<>();

    public FizzBuzz(int n) {

        size = n;
        for (int i = 1; i <= size; ++i) {
            list.add(String.valueOf(i));

        }

    }

    public void fizz(ThreadFizz fizz) {
        try {
            semaphore1.acquire();
        } catch (InterruptedException e) {
        }
        fizz.run();
        semaphore2.release();
    }

    public void buzz(ThreadBuzz buzz) {
        try {
            semaphore2.acquire();
        } catch (InterruptedException e) {
        }
        buzz.run();
        semaphore3.release();
    }

    public void fizzbuzz(ThreadFizzBuzz fizzBuzz) {
        try {
            semaphore3.acquire();
        } catch (InterruptedException e) {
        }
        fizzBuzz.run();
        semaphore4.release();

    }


    public void number(ThreadNuber nuber) {
        try {
            semaphore4.acquire();
        } catch (InterruptedException e) {
        }
        nuber.run();


    }
}

class ThreadBuzz implements Runnable {
    FizzBuzz fizzBuzz;


    ThreadBuzz(FizzBuzz fz) {
        fizzBuzz = fz;

    }

    public void run() {
        System.out.println("Buzz:");
        for (int i = 1; i <= fizzBuzz.size; ++i) {
            if (i % 5 == 0) {
                fizzBuzz.list.set(i - 1, "buzz");
                System.out.print("buzz");
            } else System.out.print(i);
            if (i < (fizzBuzz.list.size())) {
                System.out.print(",");
            }
        }

        System.out.println();

    }
}

class ThreadFizz implements Runnable {
    FizzBuzz fizzBuzz;
    int size;

    ThreadFizz(FizzBuzz fz) {
        fizzBuzz = fz;
        size = fz.size;
    }

    public void run() {
        System.out.println("Fizz:");
        for (int i = 1; i <= size; ++i) {
            if (i % 3 == 0) {
                fizzBuzz.list.set(i - 1, "fizz");
                System.out.print("fizz");
            } else System.out.print(i);
            if (i < (fizzBuzz.list.size())) {
                System.out.print(",");
            }
        }


        System.out.println();

    }
}

class ThreadFizzBuzz implements Runnable {
    FizzBuzz fizzBuzz;
    int size;

    ThreadFizzBuzz(FizzBuzz fz) {
        fizzBuzz = fz;
        size = fz.size;


    }

    public void run() {
        for (int i = 1; i <= size; ++i) {
            if (i % 5 == 0 && i % 3 == 0) {
                fizzBuzz.list.set(i - 1, "fizzbuzz");
            }

        }
        System.out.println("FizzBuzz:");
        for (int i = 0; i < fizzBuzz.list.size(); i++) {
            System.out.print(fizzBuzz.list.get(i));
            if (i < (fizzBuzz.list.size() - 1)) {
                System.out.print(",");
            }
        }

        System.out.println();

    }
}

class ThreadNuber implements Runnable {

    int size;
    FizzBuzz fizzBuzz;

    ThreadNuber(FizzBuzz fz) {
        fizzBuzz = fz;
        size = fz.size;

    }

    public void run() {

        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (fizzBuzz.list.get(i) != "fizz" && fizzBuzz.list.get(i) != "buzz" && fizzBuzz.list.get(i) != "fizzbuzz") {
                list2.add(fizzBuzz.list.get(i));

            }
        }
        System.out.println("Number:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i));
            if (i < (list2.size() - 1)) {
                System.out.print(",");
            }
        }

    }
}

public class Main3 {

    public static void main(String[] args) {
        FizzBuzz fz = new FizzBuzz(15);
        fz.fizz(new ThreadFizz(fz));
        fz.buzz(new ThreadBuzz(fz));
        fz.fizzbuzz(new ThreadFizzBuzz(fz));
        fz.number(new ThreadNuber(fz));

    }
}
