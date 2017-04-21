package com.company.encrypting;

/**
 * Created by RENT on 2017-04-21.
 */
public class Cesar {
    public static void main(String[] args) {
        System.out.println("szyfr cezara");
        System.out.println(encrypt("r\"kgu", -2));

        printArray();


        char[][] alfabetViegenera = new char[23][23];
        for (int y = 0; y < alfabetViegenera.length ; y++) {
            for (int x = 0; x < alfabetViegenera.length ; x++) {
                alfabetViegenera[x][y] = (char)(x+1 + 23*y);
            }
        }
        return alfabetViegenera[][];
    }

    public static void printArray(int[][] array) {
        for (int y = 0; y < array[0].length; y++) {
            for (int x = 0; x < array.length; x++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static String encrypt(String text, int offset){
        char[] letters = text.toCharArray();

        for (int i = 0; i < letters.length ; i++) {
            //letters[i] = letters[i] + offset; //nie działa! bo dodajemy chara do inta, a chcemy chara otrzymac a nie int
            //letters[i] = (char)(letters[i] + offset); //działa, bo mówimy javie "traktuj inta jak chara"
            letters[i] += offset;
        }
        return new String(letters);
    }

//    public static String encryptViegener(String text, String szyfr){}

}
