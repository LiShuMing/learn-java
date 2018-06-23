package com.netease.study.learnjava.cas;

import java.util.concurrent.locks.LockSupport;

/**
 * @author : lishuming
 */
public class LockSupportTest {

  public static void main(String[] args) throws Exception {
    Thread thread = new Thread(new Runnable() {
      public void run() {
        System.out.println("playing...");
        LockSupport.park();
        System.out.println("to shoping...");
      }
    });
    thread.start();
    Thread.sleep(1000);
    System.out.println("girlfriend call...");
    LockSupport.unpark(thread);
  }
}
