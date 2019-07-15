package cn.mainapp;

import java.util.ArrayList;
import java.util.Iterator;

public class RandomNumber {
    public static int[] genArray(int length) {
        ArrayList<Integer> ts = new ArrayList<>();
        while(ts.size()<length) {
            Integer i = new Integer((int)(Math.random()*length*100));
            ts.add(i);
        }
        int[] a = new int[length];
        int index = 0;
        for (Iterator<Integer> iterator = ts.iterator(); iterator.hasNext();) {
            Integer integer = iterator.next();
            a[index] = integer.intValue();
            System.out.println(a[index]);
            index++;
        }
        return a;
    }
}
