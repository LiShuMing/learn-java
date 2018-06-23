package com.netease.study.learnjava.basic;

import java.util.Random;

/**
 * @author : lishuming
 */

class Initable {
  //编译期静态常量
  static final int staticFinal = 47;
  //非编期静态常量
  static final int staticFinal2 =
      ClassInitialization.rand.nextInt(1000);
  static {
    System.out.println("Initializing Initable");
  }
}

class Initable2 {
  //静态成员变量
  static int staticNonFinal = 147;
  static {
    System.out.println("Initializing Initable2");
  }
}

class Initable3 {
  //静态成员变量
  static int staticNonFinal = 74;
  static {
    System.out.println("Initializing Initable3");
  }
}


public class ClassInitialization {
  public static Random rand = new Random(47);

  public static void main(String[] args) throws Exception {
    //字面常量获取方式获取Class对象
    Class initable = Initable.class;
    System.out.println("After creating Initable ref");
    //不触发类初始化
    System.out.println(Initable.staticFinal);
    //会触发类初始化
    System.out.println(Initable.staticFinal2);

    //会触发类初始化
    System.out.println(Initable2.staticNonFinal);

    //forName方法获取Class对象
    Class initable3 = Class.forName("com.netease.study.learnjava.basic.Initable3");
    System.out.println("After creating Initable3 ref");
    System.out.println(Initable3.staticNonFinal);


    Class intClass = int.class;
    Class<Integer> integerClass = int.class;
    integerClass = intClass;
    intClass = float.class;
    integerClass = int.class;

    Class<?> intClass2 = int.class;
    intClass2 = double.class;

    Animal animal = new Dog();
    Dog dog = (Dog) animal;
  }

}

interface Animal{}
class Dog implements Animal {}
