package com.company.simple;

/**
 * Created by RENT on 2017-04-18.
 */
public class Simple {
    public static void main(String[] args) {
        //ZADANIE1
        //System.out.println("Zadanie1");

        // tworzymy tablicę o wielkości 100 (tablica intów)
        // wypełniamy liczbami parzystymi
        // 2 4 6...
        int[] myArray = new int[100];

        // ROZWIĄZANIE 1
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 2 + 2;
        }

        // ROZWIĄZANIE 1.5
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (i + 1) * 2;
        }

        // ROZWIĄZANIE 2
        myArray[0] = 2;
        for (int i = 1; i < myArray.length; i++) {
            myArray[i] = myArray[i - 1] + 2;
        }

        // ROZWIĄZANIE 3
        int temp = 0;
        for (int i = 0; i < myArray.length; i++) {
            temp += 2;
//            temp = temp + 2;

            myArray[i] = temp;
        }

        //ZADANIE2
        System.out.println("Zadanie2");
        //Stworzyć tablicę z wymyślonymi liczbami, znaleźć MIN i MAX

        int[] mojaTablica = new int[]{1, 3, 0, 2, 7, 6};
        //minimum
        int min = mojaTablica[0];
        for (int i = 0; i < mojaTablica.length; i++) {
            if (mojaTablica[i] < min) {
                min = mojaTablica[i];
            }
        }
        System.out.println(min);

        //minimum, ale szybciej = zaczynac od i = 1, bo i = 0 niem usimy porównywac z samym sobą

        //maksimum
        int max = mojaTablica[0];
        for (int i = 1; i < mojaTablica.length; i++) {
            if (mojaTablica[i] > max) {
                max = mojaTablica[i];
            }
        }
        System.out.println(max);

        //ZADANIE3
        System.out.println("Zadanie3");
        //odwrocic elementy w tablicy
        //rozwiazanie1
        int[] tablica = new int[]{1, 3, 0};
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
        for (int i = 0; i < tablica.length / 2; i++) {
            int tmp = tablica[i];
            int maxIndex = tablica.length - 1;
            tablica[i] = tablica[maxIndex - i];
            tablica[maxIndex - i] = tmp;
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
        //rozwiazanie2
        int[] arrayToReverse = new int[]{5, 3, 1};
        int[] reversedArray = new int[arrayToReverse.length];
        reversedArray[0] = arrayToReverse[2];
        reversedArray[1] = arrayToReverse[1];
        reversedArray[2] = arrayToReverse[0];
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }
        //ZADANIE 4
        //Wykreślenie (zamiana na np. -1) w tablicy wartości nieparzystych
        System.out.println("zadanie 4");
        int[] unpairedToChange = new int[]{5, 2, 3, 4, 2, 7, 1};
        for (int i = 0; i < unpairedToChange.length; i++) {
            if (unpairedToChange[i] %2 > 0){
                unpairedToChange[i] = -1;
            }
            System.out.println(unpairedToChange[i]);
        }

        //zadanie5
        System.out.println("zadanie 5");
        //suma liczb w tablicy
        int suma = 0;
        int[] toSum = new int[]{5, 5, 5, 10};
        for (int i = 0; i < toSum.length ; i++) {
            suma = suma + toSum[i];
          //  System.out.println(suma); tu wypisuje sume po kazdym i
        }
        System.out.println(suma);


    }
}
