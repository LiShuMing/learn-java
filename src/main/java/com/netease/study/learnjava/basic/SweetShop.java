package com.netease.study.learnjava.basic;

/**
 * @author : lishuming
 */

class Candy {
  static {
    System.out.println("Candy");
  }
}

class Gum {
  static {
    System.out.println("Loading Gum");
  }
}

class Cookie {
  static {
    System.out.println("Loading Cookie");
  }
}

public class SweetShop {
  public static void print(Object obj) {
    System.out.println(obj);
  }

  public static void main(String[] args) {
    print("inside main");

    new Candy();

    print("after candy");

    try {
      Class cls = Class.forName("com.netease.study.learnjava.basic.Cookie");
      print("class name: " + cls.getName());

      Cookie ck = new Cookie();
      Class cls2 = ck.getClass();
      print("class:" + cls2.getCanonicalName());
    } catch (Exception e) {
      print("cannot find cookie");
      e.printStackTrace();
    }
    print("after find cookie");

    print(int.class.getCanonicalName());

    new Gum();
    print("after gum");
  }

}
