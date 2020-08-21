package com.eugene.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try(DataOutputStream dout =  new DataOutputStream(new FileOutputStream("Test.dat")))
        {
            dout.writeBoolean(true);
            dout.writeDouble(98.6);
            dout.writeInt(12);

        }catch (FileNotFoundException e)
        {
            System.out.printf("Нельзя открыть файл вывода");
        }
        catch (IOException e)
        {
            System.out.printf("Ошибка ввода вывода "+ e );

        }
        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat")))
        {
            double n = din.readDouble();
            boolean b = din.readBoolean();
            int i = din.readInt();
        }catch (FileNotFoundException e )
        {
            System.out.printf("Не найден файл для открытия");
        }
        catch (IOException e )
        {
            System.out.printf("Ошибка ввода вывода "+e );
        }
    }
}
