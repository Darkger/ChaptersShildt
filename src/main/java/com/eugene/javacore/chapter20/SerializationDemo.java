package com.eugene.javacore.chapter20;

import java.io.*;

class MyClass implements Serializable
{
    String s;
    int i;
    double d;
    public MyClass (String s, int i ,double d)
    {
        this.d=d;
        this.i=i;
        this.s=s;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}
public class SerializationDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial")))
        {
            MyClass object1 = new MyClass("Hello",-7,2.7e10);
            System.out.println("object1:"+ object1);
            objOStrm.writeObject(object1);
        }catch (IOException e ){}
        try (ObjectInputStream objIn= new ObjectInputStream(new FileInputStream("serial")))
        {
            MyClass object1 = (MyClass)objIn.readObject();

        }catch (IOException | ClassNotFoundException e ){}
    }
}
