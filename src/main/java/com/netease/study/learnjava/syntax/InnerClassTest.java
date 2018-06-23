package com.netease.study.learnjava.syntax;

import java.util.Stack;

/**
 * @author : lishuming
 */
public class InnerClassTest {
  public static void main(String[] args) {
    //InnerClass innerClass = new InnerClass();

    InnerClass.InInnerClass innerClass1 = new InnerClass().new InInnerClass();
    innerClass1.set(10);
    System.out.println(innerClass1.get());

    Stack<Integer> stack = new Stack<Integer>();
  }
}
