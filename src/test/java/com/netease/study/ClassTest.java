package com.netease.study;

import org.junit.Test;

/**
 * @author : lishuming
 */
public class ClassTest {
    @Test
    public void testClass1() {
        new A().printA();

        B.printB();
    }

    public class A {
        public void printA() {
            System.out.print("A");
        }
    }

    public static class B {
        public static void printB() {
            System.out.print("B");
        }

    }
}
