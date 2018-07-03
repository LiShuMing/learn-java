package com.netease.study.learnjava.learnutils;

import java.util.Collections;
import java.util.Map;

/**
 * Created by lishuming on 2018/3/14.
 */
public class CollectionsTest {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.emptyMap();
        System.out.println(map.size());

        try {
            map.put(1, "1");
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported Operation");
        }
    }
}
