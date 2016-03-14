package com.brainacad.oop.testgenerics1;

/**
 * Created by Yuriy on 14.03.2016.
 */
public class MyTuple<A, B, C> {
    private A a; //створюємо змінні невизначених типів даних
    private B b;
    private C c;

    public MyTuple(A a, B b, C c) {//створюємо конструктор
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {//створюємо геттери
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }
}
