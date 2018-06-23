package com.netease.study.learnjava.basic;

import java.lang.reflect.Constructor;

/**
 * @author : lishuming
 */
class User {
  static {
   System.out.println("static initializ....");
  }

  private int age;
  private String name;

  public User() {
    super();
  }
  public User(String name) {
    super();
    this.name = name;
  }

  private User(int age, String name) {
    super();
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "age:" + age + ", name:" + name;
  }
}
public class ReflectDemo {
  public static void main(String[] args) throws Exception {
    Class<?> clazz = null;

    clazz = Class.forName("com.netease.study.learnjava.basic.User");

    User user = (User)clazz.newInstance();
    user.setAge(27);
    user.setName("lishuming");
    System.out.println(user);
    System.out.println("--------------------------------------------");


    Constructor cs1 = clazz.getConstructor(String.class);
    User user1 = (User)cs1.newInstance("lsm");
    user1.setAge(27);
    user1.setName("lishuming");
    System.out.println(user1);
    System.out.println("--------------------------------------------");

    Constructor cs2 = clazz.getDeclaredConstructor(int.class, String.class);
    cs2.setAccessible(true);
    User user2 = (User) cs2.newInstance(18, "test");
     System.out.println(user1);
    System.out.println("--------------------------------------------");

  }
}
