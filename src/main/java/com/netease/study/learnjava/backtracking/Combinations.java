package com.netease.study.learnjava.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
  public static void main(String[] args) {
    List<List<Integer>> result = new Combinations().combine(3, 2);
    for (List<Integer> i : result) {
      printArray(i);
    }
  }
  private static void printArray(List<Integer> list) {
    StringBuilder sb = new StringBuilder();
    for (Integer i : list) {
      sb.append(i).append(",");
    }
    System.out.println(sb.subSequence(0, sb.length() - 1).toString());
  }

  public List<List<Integer>> combine(int n, int k) {
    int[] subArr = new int[k];
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    getNext(0, 0, n, k, subArr, result);
    return result;
  }

  private void getNext(int i, int count, int n, int k, int[] subArr, List<List<Integer>> result) {
    if (k == 0) {
      List<Integer> subList = new ArrayList<Integer>();
      for (int a: subArr) {
        subList.add(a);
      }
      result.add(subList);
    } else {
      for (int j = i + 1; j <= n; j++) {
        subArr[count] = j;
        getNext(j, count + 1, n, k - 1, subArr, result);
      }
    }
  }
}
