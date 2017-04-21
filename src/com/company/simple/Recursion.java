package com.company.simple;

/**
 * Created by RENT on 2017-04-21.
 */
public class Recursion {
    public static int sum(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("suma rekurencyjna " + sumRecursive(5));
        System.out.println("silnia rekurencyjna " + factorialRecursive(3));
        System.out.println("mnożenie rekurencyjne " + multiplyRecursive(4, 3));
        System.out.println("największy wspólny dzielnik" + gcd(15, 10));
        System.out.println("fibonnaci" + fibbonaciNumber(6));

    }

    public static int sumRecursive(int x) {
        if (x > 1) {
            return x + sumRecursive(x - 1);
        } else {
            return 1;
        }
    }

    public static int factorial(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int factorialRecursive(int x) {
        if (x > 1) {
            return x * factorialRecursive(x - 1);
        } else {
            return 1;
        }
    }

    public static int multiplyRecursive(int x, int y) {
        if (x > 0 && y > 0) {
            return x + multiplyRecursive(x, y - 1);
        } else {
            return 0;
        }

        //lub
//        if(x == 1){
//            return x;
//        }else{
//            return x + multiplyRecursive(x, y-1);
//        }

    }

    //największy wspolny dzielnik x i y
    public static int gcd(int k, int n) {
        if (k > 0) {
            return gcd(n % k, k);
        } else {
            return n;
        }
    }

    public static int fibbonaciNumber(int x) {
        if (x < 3) {
            return 1;
        } else {
            return fibbonaciNumber(x-1) + fibbonaciNumber(x-2);
        }
    }
    //szyfrowanie (szyfr) cezara

}
