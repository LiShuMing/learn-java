package com.netease.study.learnjava.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author : lishuming
 */
public class WeakReferencGC {
  static class Car {
    private double price;
    private String color;

    public Car(double p, String c) {
      this.price = p;
      this.color = c;
    }

    public double getPrice() {
      return price;
    }

    public void setPrice(double price) {
      this.price = price;
    }

    public String getColor() {
      return color;
    }

    public void setColor(String color) {
      this.color = color;
    }
  }

  public static void test1() {
    Car car = new Car(10.0, "Red");
    WeakReference<Car> weakReference = new WeakReference<Car>(car);

    long i = 0L;
    while(true) {
      if (weakReference.get() != null) {
        i++;
        System.out.println(String.format("Object is alive(%d): %s", i, weakReference));
      } else {
        System.out.println("Object is dead!");
        break;
      }
    }
  }

  private final static List<Reference> lists = new ArrayList();
  public static void test2() {
    final ReferenceQueue rq = new ReferenceQueue();

    new Thread(new Runnable() {
      public void run() {
        int i = 0;
        while (true) {
          try {
            Reference ref = rq.remove();
            System.out.println("reference :" + ref);
            System.out.println("get:" + ref.get());
            i++;
            System.out.println("reference i:" + i);
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }
    }).start();


    for (int i = 0; i < 10000; i++) {
      byte[] a = new byte[1024];
      Reference r = new SoftReference(a, rq);
      lists.add(r);
      System.gc();
      System.out.println("count:" + i);

      try {
        TimeUnit.MILLISECONDS.sleep(100);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    //test1();
    test2();
  }
}
