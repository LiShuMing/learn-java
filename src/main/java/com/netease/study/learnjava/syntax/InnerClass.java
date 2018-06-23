package com.netease.study.learnjava.syntax;

/**
 * @author : lishuming
 */
public class InnerClass {
  class InInnerClass {
   public InInnerClass() {
   }
   private int i;
   public void set(int k) {
     i = k;
   }
   public int get() {
     return i;
   }
  }

  private InInnerClass inInnerClass;

  public InnerClass() {
    inInnerClass = new InInnerClass();
  }

}
