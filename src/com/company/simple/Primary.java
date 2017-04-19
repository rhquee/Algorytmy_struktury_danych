package com.company.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-18.
 */
public class Primary {
    public static void main(String[] args) {
        int x = 55;
        // boolean isPrimary = isPrimary(int x);
        boolean isPrimary = isPrimary(x);
        System.out.println(x + " is primary: " + isPrimary);

        //znalezienie wszytskuich pierwszych mniejszych od x
        List<Integer> primesLessThan = findPrimaryLessThan(x); //x i wtedt int = 30 (wyzej zadeklarowana zmienna lub konkret liczba)
        for (int i = 0; i < primesLessThan.size(); i++) {
            int elem = primesLessThan.get(i);
            System.out.println(elem);
        }

        // czynniki pierwsze liczby 54
        System.out.println("Czynniki pierwsze liczby " + x);
        List<Integer> primeFactors = primeFactors(x);

        for (int i = 0; i < primeFactors.size(); i++) {
            System.out.println(primeFactors.get(i));
        }
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
        List<Integer> primaryList = new ArrayList<>();
        for (int i = 2; i < x; i++) {
            boolean isPrime = isPrimary(i);
            if (isPrime) {
                primaryList.add(i);
            }
        }
        return primaryList;
    }

    public static List<Integer> primeFactors(int x) {
        List<Integer> primeFactorList = new ArrayList<>();
        List<Integer> primes = findPrimaryLessThan(x);

        int index = 0;

        while (x > 1) {
            int currentPrimeNumber = primes.get(index);
            if (x % currentPrimeNumber == 0) {
                primeFactorList.add(currentPrimeNumber);
                x = x / currentPrimeNumber;
            } else {
                index++;
            }

        }
        return primeFactorList;
    }
}