package com.company.simple;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-19.
 */
public class MultiArrays {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};

        // TABLICE DWUWYMIAROWE
        int[][] arrayTest = new int[3][2];

        // pierwszy element tablicy dwuwymiarowej to TABLICA!
        int[] innerArray = arrayTest[0];
        int i = innerArray[1];


        i = arrayTest[0][1];

        // sposób wypisywania - tablica wewnętrzna = wiersz
        int[][] arrayMult = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        // przejście po tablicy dwuwymiarowej
        for (int x = 0; x < arrayMult.length; x++) {
            int[] inner = arrayMult[x];

            for (int y = 0; y < inner.length; y++) {
                System.out.print(inner[y] + " ");
            }
            System.out.println();
        }

        // Wypisywanie - wewnętrzna tablica jako wiersz /kolumna raczej
        //  printArray(arrayMult);


        //stworzyc tablice 5x5,
        //1, 2, 3, 4, 5
        //1, 2, 3, 4, 5
        //itd

        int[][] array55 = new int[5][5];
        for (int y = 0; y < array55.length; y++) {
            for (int x = 0; x < array55.length; x++) {
                array55[x][y] = x + 1;
            }
        }
        printArray(array55);

        //1, 2, 3, 4, 5
        //2, 3, 4, 5, 6
        //3, 4, 5, 6, 7
        //itd
        System.out.println("mix 5x5");
        int[][] array5x5 = new int[5][5];
        for (int y = 0; y < array5x5.length; y++) {
            for (int x = 0; x < array5x5.length; x++) {
                array5x5[x][y] = (x+1)+y;
            }
        }
        printArray(array5x5);

        System.out.println("mix 5x5, od 5 do 25");
        int[][] array5x5ciagiem = new int[5][5];
        for (int y = 0; y < array5x5ciagiem.length; y++) {
            for (int x = 0; x < array5x5ciagiem.length; x++) {
                array5x5ciagiem[x][y] = x+1+5*y;
            }
        }
        printArray(array5x5ciagiem);

        //tworzymy tablice o wymiarach x i y, podanych przez usera
        //pytamy usera o wartosc kazdego x i y
        //wypisujemy tablice

        System.out.println("tablica xxy, x i y podane od usera");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tworzysz tablice - ilość kolumn to: ");
        int x = scanner.nextInt();
        System.out.println("A ilość wierszy to: ");
        int y = scanner.nextInt();
        int[][] arrayXY = new int[x][y];
        System.out.println("Brawo! Twoja tablica póki co jest pusta. Uzupełnij ją");
        printArray(arrayXY);
        for (int h = 0; h < arrayXY[0].length ; h++) {
            for (int w = 0; w < arrayXY.length ; w++) {
                System.out.println("Podaj wartosc dla x" + w + "y" + h);
               // arrayXY[w][h] = scanner.nextInt();
                int value = new Scanner(System.in).nextInt();
                arrayXY[w][h] = value;
            }
            printArray(arrayXY);


        }

//        for (int y = 0; y < arrayXY.length; y++) {
//            for (int x = 0; x < arrayXY.length; x++) {
//                arrayXY[x][y] = x+1+5*y;
//            }
//        }


    }

    public static void printArray(int[][] array) {
        for (int y = 0; y < array[0].length; y++) {
            for (int x = 0; x < array.length; x++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }
}