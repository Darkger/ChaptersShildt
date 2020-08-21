package com.eugene.javacore.chapter15;

import com.sun.xml.internal.txw2.annotation.XmlNamespace;

interface MyFunc8<T> {
    boolean func(T v1, T v2);
}

class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc8<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v))
                count++;
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(90),
                new HighTemp(88),
                new HighTemp(67),
                new HighTemp(79),
                new HighTemp(88),
                new HighTemp(98),
                new HighTemp(89), new HighTemp(89)};
        count = counter(weekDayHighs,HighTemp::sameTemp,new HighTemp(89));
    }
}
