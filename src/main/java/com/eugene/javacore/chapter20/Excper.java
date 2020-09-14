package com.eugene.javacore.chapter20;

public class Excper {
    public static void main(String[] args) {
        String str= "1,Ivan,Ivanov,[2,3,5],100500.";
        String str2 [] = str.split("[\\[\\]]");
        String str4 [] = str2[0].substring(0,str2[0].length()-1).split(",");
        String strReg=str2[2].substring(1,str2[2].length()-1);
        String strArray [] = new String[]{str4[0],str4[1],str4[2],str2[1],strReg};
        for(String str3:strArray)
            System.out.println(str3);
    }
}
