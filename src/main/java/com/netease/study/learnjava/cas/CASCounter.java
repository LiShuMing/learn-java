package com.netease.study.learnjava.cas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class CASCounter {
    private static Integer integer = 0;

    public static void main(String[] args) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);

        final Random random = new Random();
        long startTime = System.currentTimeMillis();

        int threadNum = 1000;
        List<Thread> threads = new ArrayList<Thread>(threadNum);
        for (int i = 0; i < threadNum; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    integer++;

                    for (; ; ) {
                        Integer i = atomicInteger.get();
                        if (random.nextBoolean()) {
                            i = random.nextInt(100);
                        }
                        boolean ret = atomicInteger.compareAndSet(i, ++i);
                        if (ret) {
                            break;
                        } else {
                            System.out.println("error:" + i);
                        }
                    }
                }
            });

            threads.add(t);
        }

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println(atomicInteger.get());
        System.out.println(integer);

        long usedTime = endTime - startTime;
        System.out.println(usedTime + "ms");

    }
}
