package com.netease.study.learnjava.lang;

import java.lang.System;
import java.io.Console;

/**
 * Created by lishuming on 2018/3/14.
 *
 * @since 1.6
 */
public class SystemTest {
  public static void main(String[] args) {
    Console console = System.console();
    String test = console.readLine("test:");
    console.printf("read:" + test);
  }
}
