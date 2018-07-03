package com.netease.study.learnjava.cas;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedCounter {
    private static Integer i = 0;
    private static Integer j = 0;
    private boolean debug = false;

    public void increase() {
        synchronized (this) {
            if (debug) {
                System.out.println("start:" + i);
            }
            int t = i;
            i++;
            int k = i;
            if (t != k - 1) {
                System.out.println("error:" + k + ", " + t);
            }
            if (debug) {
                System.out.println(i);
                System.out.println("end:" + i);
            }
        }
    }

    public void increaseSyncCode() {
        synchronized (this) {
            if (debug) {
                System.out.println("j start:" + j);
            }
            j++;
            if (debug) {
                System.out.println("j:" + j);
                System.out.println("j end:" + j);
            }
        }
    }

    public static void main(String[] args) {
        int threadNum = 1000;
        final SynchronizedCounter test = new SynchronizedCounter();
        long start = System.currentTimeMillis();
        List<Thread> ts = new ArrayList<Thread>(threadNum);
        for (int i = 0; i < threadNum; i++) {
            ts.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    test.increaseSyncCode();
                    test.increase();
                }
            }));
        }

        for (Thread t : ts) {
            t.start();
        }

        for (Thread t : ts) {
            try {
                t.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("i:" + i);
        System.out.println("j:" + i);
        System.out.println(end - start + "ms");
    }
}
