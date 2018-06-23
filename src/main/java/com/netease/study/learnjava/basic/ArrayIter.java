package com.netease.study.learnjava.basic;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author : lishuming
 */
public class ArrayIter<T> implements Iterable<T>, Iterator<T> {
  protected T[] datas;
  protected int index = 0;

  public T[] getDatas() {
    return datas;
  }

  public void setDatas(T[] datas) {
    this.datas = datas;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public ArrayIter(final T[] datas) {
    setDatas(datas);
  }

  @Override
  public boolean hasNext() {
    return index < datas.length;
  }

  @Override
  public T next() {
    if (hasNext()) {
      return datas[index++];
    }
    throw new NoSuchElementException("only " + index + " lengthb");
  }

  @Override
  public Iterator<T> iterator() {
    index = 0;
    return this;
  }

  public static void main(String[] args) {
    String[] strs = {"a", "b"};

    ArrayIter iter = new ArrayIter<String>(strs);
    iter.forEach(System.out::println);
  }
}
