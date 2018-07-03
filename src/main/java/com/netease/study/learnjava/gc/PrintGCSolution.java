package com.netease.study.learnjava.gc;

/**
 * @author : lishuming
 */
public class PrintGCSolution {
    /**
     * -Xms20m -Xmx20m -Xmn10m -XX:+UseSerialGC -XX:SurvivorRatio=3 -XX:+PrintGCDetails -XX:+PrintHeapAtGC
     * -XX:+PrintTenuringDistribution
     */
    public static void main(String[] args) throws Exception {
        while (true) {
            byte[] bytes1 = new byte[1024 * 1024 * 2];
            byte[] bytes2 = new byte[1024 * 1024 * 1];
            byte[] bytes3 = new byte[1024 * 512];
            bytes1 = null;
            byte[] bytes4 = new byte[1024 * 1024 * 3];

            byte[] bytes5 = new byte[1024 * 1024];
            bytes2 = null;
            bytes4 = null;
            byte[] bytes6 = new byte[1024 * 1024 * 2];
        }
    }
}
