package com.eugene.javacore.chapter15;
interface NumericTest{
    boolean test (int n);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n)->(n%2)==0;
        if (isEven.test(10))System.out.println("Число 10 четное");
        if (!isEven.test(9))System.out.println("Число 9 не четное ");
        NumericTest isNonNeg = (n)->n>=0;
        if(isNonNeg.test(1))
            System.out.println("число 1 неотрицательное");
        if(!isNonNeg.test(-1))
            System.out.println("чилсо -1 отрицательное");

    }

}

