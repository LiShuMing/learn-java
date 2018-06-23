package com.netease.study.learnjava.lang;

import java.lang.Integer;

/**
 * Created by lishuming on 2018/3/14.
 */
public class IntergerTest {
  public static void main(String[] args) {
    int i = 100;
    System.out.println(Integer.bitCount(i));
    System.out.println(Integer.highestOneBit(i));
    System.out.println(Integer.toBinaryString(i));
    System.out.println(Integer.toBinaryString(-i));

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    Integer i1 = new Integer(10);
    Integer i2 = new Integer(10);
    System.out.println(i1 == i2);
    System.out.println(i1.equals(i2));

    Integer f1 = 1000;
    Integer f2 = 1000;

    System.out.println(f1 == f2);

    String str1 = "str";
    String str2 = "str";
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));

    System.out.println("**************");

    TestA a = new TestA(10);
    TestA b = new TestA(10);

    System.out.println(a.hashCode());
    System.out.println(b.hashCode());

    System.out.println(a == b);
    System.out.println(a.equals(b));

    System.out.println(a.equals(a));
    System.out.println(b.equals(b));
  }
}
