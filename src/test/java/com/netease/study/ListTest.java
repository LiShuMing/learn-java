package com.netease.study;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lishuming
 */
public class ListTest {
    @Test(expected = IndexOutOfBoundsException.class)
    public void testList() {
        List<Integer> list = new ArrayList<Integer>();

        list.add(-1, 1);

        for (Integer i : list) {
            System.out.print(i);
        }
    }
}
