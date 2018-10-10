package com.qy.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        int a[] = {3, 4, 34, 6, 7, 3, 2, 1, 6, 9, 5, 6, 4};
        int x = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    x = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = x;
                }
            }
        }
        for (int c = 0; c < a.length - 1; c++) {
            System.out.println(a[c]);
        }

        Map map = new HashMap();
        map.put(1,"1");
        List list = new ArrayList();


    }

}
