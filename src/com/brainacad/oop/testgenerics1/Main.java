package com.brainacad.oop.testgenerics1;

/**
 * Created by Yuriy on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTuple<String,Integer,Long> tuple1=new MyTuple<>("message",4,21L);//створюємо обєкти з різними параметрами. Маємо один конструктор, який параметризований.
        MyTuple<Double,String,String> tuple2=new MyTuple<>(5.0,"message1","message2");
        System.out.print(tuple1.getA()+" ");//вивидимо на друк обєкт 1
        System.out.print(tuple1.getB()+" ");
        System.out.println(tuple1.getC());
        System.out.print(tuple2.getA()+" ");//вивидимо на друк обєкт 2
        System.out.print(tuple2.getB()+" ");
        System.out.print(tuple2.getC());
    }
}
