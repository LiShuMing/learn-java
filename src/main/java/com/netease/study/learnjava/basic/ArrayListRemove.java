package com.netease.study.learnjava.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author : lishuming
 */
public class ArrayListRemove {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    list.forEach(System.out::println);
    System.out.println("******");
    System.out.println(list.size());
    System.out.println("******");

    ArrayList list2 = new ArrayList();
    list2.add(2);
    list2.add(3);
    list2.add(4);

    // BAD SOLUTION!!!
    /**
    for (int i = 0; i < list.size(); i++) {
      System.out.println("i:" + i);
      System.out.println("size:" + list.size());
      System.out.println("to remove :" + list.get(i));

      if (list2.contains(list.get(i))) {
        System.out.println("remove :" + list.get(i));
        list.remove(list.get(i));
      }
    }
    list.forEach(System.out::println);
    System.out.println("******");*/

    for (Iterator iterator = list.iterator(); iterator.hasNext();) {
      int v = (int)iterator.next();
      for (Iterator it2 = list2.iterator(); it2.hasNext();) {
        int v2 = (int)it2.next();
        if (v == v2) {
          iterator.remove();
          break;
        }
      }
    }
    list.forEach(System.out::println);

    System.out.println("******");
    HashSet<Integer> hashSet = new HashSet();
    hashSet.add(1);
    hashSet.add(null);
    hashSet.add(null);
    hashSet.add(1);
    hashSet.add(2);
    hashSet.forEach(System.out::println);

    System.out.println("******");
    Hashtable<String, Integer> hashtable = new Hashtable<>();
    hashtable.put("", 1);
    hashtable.put("", 1);
    //hashtable.put(null, 1);
    for (String k : hashtable.keySet()) {
      System.out.println(k + ":" + hashtable.get(k));
    }

    System.out.println("******");
    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("", 1);
    hashMap.put("", 1);
    hashMap.put(null, 1);
    for (String k : hashMap.keySet()) {
      System.out.println(k + ":" + hashMap.get(k));
    }

    int[] arr = {1, 2, 3};
    System.out.println(Arrays.toString(arr));
  }
}
