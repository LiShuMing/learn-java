package com.netease.study.learnjava.inject;


import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * @author : lishuming
 */
@Singleton
public class HelloCaller {

  @Inject
  private Hello hello;

  public void sayHello() {
    System.out.println(this);
    hello.sayHello();
  }
}
