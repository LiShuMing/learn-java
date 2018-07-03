package com.netease.study.learnjava.lang;

import java.util.Random;

public class TestA {
    Random random = new Random();
    private int a;

    public TestA(int a) {
        a = a;
    }

    @Override
    public boolean equals(Object test) {
        boolean t = random.nextBoolean();
        System.out.println(a + "," + t);
        return true;
    }

    @Override
    public int hashCode() {
        int t = random.nextInt(100);
        System.out.println(a + "," + t);
        return t;
    }
}
