package com.eugene.javacore.practic2;

import java.util.ArrayList;
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

    public void fizz() {
        try {
            semaphore1.acquire();
        } catch (InterruptedException e) {
        }
        System.out.println("Fizz:");
        for (int i = 1; i <= size; ++i) {
            if (i % 3 == 0) {
                list.set(i - 1, "fizz");
                System.out.print("fizz");
            } else System.out.print(i);
            if (i < (list.size())) {
                System.out.print(",");
            }
        }


        System.out.println();
        semaphore2.release();
    }

    public void buzz() {
        try {
            semaphore2.acquire();
        } catch (InterruptedException e) {
        }
        System.out.println("Buzz:");
        for (int i = 1; i <= size; ++i) {
            if (i % 5 == 0) {
                list.set(i - 1, "buzz");
                System.out.print("buzz");
            } else System.out.print(i);
            if (i < (list.size())) {
                System.out.print(",");
            }
        }

        System.out.println();
        semaphore3.release();
    }

    public void fizzbuzz() {
        try {
            semaphore3.acquire();
        } catch (InterruptedException e) {
        }
        for (int i = 1; i <= size; ++i) {
            if (i % 5 == 0 && i % 3 == 0) {
                list.set(i - 1, "fizzbuzz");
            }

        }
        System.out.println("FizzBuzz:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < (list.size() - 1)) {
                System.out.print(",");
            }
        }

        System.out.println();
        semaphore4.release();

    }


    public void number() {

        try {
            semaphore4.acquire();
        } catch (InterruptedException e) {
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (list.get(i) != "fizz" && list.get(i) != "buzz" && list.get(i) != "fizzbuzz") {
                list2.add(list.get(i));

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

class ThreadBuzz implements Runnable {
    FizzBuzz fizzBuzz;


    ThreadBuzz(FizzBuzz fz) {
        fizzBuzz = fz;
        new Thread(this).start();
    }

    public void run() {
        fizzBuzz.buzz();

    }
}

class ThreadFizz implements Runnable {
    FizzBuzz fizzBuzz;

    ThreadFizz(FizzBuzz fz) {
        fizzBuzz = fz;

        new Thread(this).start();
    }

    public void run() {
        fizzBuzz.fizz();

    }
}

class ThreadFizzBuzz implements Runnable {
    FizzBuzz fizzBuzz;

    ThreadFizzBuzz(FizzBuzz bz) {
        fizzBuzz = bz;

        new Thread(this).start();
    }

    public void run() {
        fizzBuzz.fizzbuzz();
    }
}

class ThreadNuber implements Runnable {

    FizzBuzz fizzBuzz;

    ThreadNuber(FizzBuzz fz) {
        fizzBuzz = fz;

        new Thread(this).start();
    }

    public void run() {

        fizzBuzz.number();
    }
}

public class Main3 {

    public static void main(String[] args) {
        FizzBuzz fz = new FizzBuzz(15);

        new ThreadFizz(fz);
        new ThreadBuzz(fz);
        new ThreadFizzBuzz(fz);
        new ThreadNuber(fz);

    }
}
