package cn.mainapp;

import java.util.ArrayList;
import java.util.Iterator;

public class PeiXunRandom {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        a.add("闫明");
        a.add("纪津");
        a.add("王思铭");
        a.add("王艳艳");
        a.add("周志伟");
        a.add("张震");
        a.add("刘春旭");
        a.add("张振环");
        a.add("潘晨");
        a.add("常若男");
        a.add("胡文达");
        a.add("董博宇");
        a.add("张金梁");
        a.add("张一夫");
        
        while(a.size()>0) {
            int size = a.size();
            int index = (int)(Math.random()*size);
            String x = a.get(index);
            a.remove(index);
            b.add(x);
        }
        for (Iterator<String> iterator = b.iterator(); iterator.hasNext();) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}