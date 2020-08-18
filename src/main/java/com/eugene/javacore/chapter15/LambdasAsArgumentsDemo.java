package com.eugene.javacore.chapter15;
interface  StringFunc4{
    String func ( String n);

}
public class LambdasAsArgumentsDemo {
    static String stringOp (StringFunc4 sf, String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
     String inStr = "Лямбда-выражения повышают эффективность Java";
     String outStr;
     System.out.println("Это исходная строка : "+ inStr);
     outStr = stringOp((str)->str.toUpperCase(), inStr);
     System.out.println("Это стркоа в верхнем регистре:"+ outStr);
     outStr= stringOp((str)->{
         String result="";
         for(int i=0;i<str.length();i++)
         {
             if (str.charAt(i)!=' ')
                 result+=str.charAt(i);

         }
         return result;
     },inStr);
     System.out.println("Это строка с удаленными пробелами "+outStr);
     StringFunc4 reveres = (str)->{
         String result="";
         int i;
         for (i=str.length()-1;i>=0;i--)
         {
             result+=str.charAt(i);

         }
         return result;
     };
     System.out.println("Это обращенная строка "+ stringOp(reveres,inStr));

        }

}
