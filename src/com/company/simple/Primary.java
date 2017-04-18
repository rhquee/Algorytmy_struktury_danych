package com.company.simple;

import java.util.List;

/**
 * Created by RENT on 2017-04-18.
 */
public class Primary {
    public static void main(String[] args) {
        int x = 5;
        boolean isPrimary = isPrimary(x);
        System.out.println(x + " is primary: " + isPrimary);
    }

    public static boolean isPrimary(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findPrimaryLessThan(int x) {

        return null;
    }
}