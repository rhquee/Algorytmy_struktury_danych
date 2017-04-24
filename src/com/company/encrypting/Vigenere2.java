package com.company.encrypting;

import java.util.Scanner;

/**
 * Created by E550 on 2017-04-24.
 */
public class Vigenere2 {

    private String inputString;
    private String passString;
    //znak = wartość jako integer np a=97 z=123
    //new char[][] w nawiasach wartość nie mniejsza niż dlugosc tablicy (litera nie wczesniejsza +1)
    //pierwszy nawias za wiersze
    //drugi nawias za kolumny
    private char[][] alfabet = new char['z'+1]['z'+1];
    private Scanner console = new Scanner(System.in);


    public static void main(String[] args) {
//22-23 pisanie alfabetu
        Vigenere2 aplikacja = new Vigenere2();
        aplikacja.utworzAlfabet();
        aplikacja.getDataFromConsole();
    }

//tworzenie tablicy - alfabetu
    public void utworzAlfabet() {
        //pierwszy for leci od a do z, na końcu linijki dodaje +++,
        //pierwszy for odpowiada za wartości pierwszej KOLUMNY
        //char a = 'd'; a<='h' będzie drukowało w pierwszej kolumnie pierwszą wartość d a ostatnią h (tj 5 wierszy)
        for (char a = 'a'; a <= 'm'; a++) {
            System.out.println((int)a);
            char b = a; //chary
            //drugi for leci wierszami
            for (int z = 'a'; z <= 'm'; z++) {
                if (b == 'z') {
                    b = 'a';
                }
                alfabet[a][z] = b;
                System.out.print(b + " ");
                //b++ odpowiada za zmiane wartości w wierszach,
                //w pp. mam:
                // aaaaa
                // bbbbb
                // ....
                // mmmmm
                b++;
            }

        }
    }


    public void getDataFromConsole() {
        System.out.println("\n\n Wybierz opcje: \n\n 1. Szyfruj\n 2. Deszyfruj\n 3. Koniec\n");
        System.out.print("#:");
        String option = console.nextLine();
        if ("1".equals(option)) {
            System.out.println("Podaj text do szyfrowania (max 255 znakow)");
            System.out.print("  text:");
            inputString = console.nextLine();
            System.out.println("\nPodaj Haslo nie krrotsze niz " + inputString.length() + "(max 255 znakow)");
            System.out.print("  haslo:");
            passString = console.nextLine();
            crypt(inputString, passString);
            getDataFromConsole();
        } else if ("2".equals(option)) {
            System.out.println("Podaj text do odszyfrowania (max 255 znakow)");
            System.out.print("  text:");
            inputString = console.nextLine();
            System.out.println("\nPodaj Haslo nie krrotsze niz " + inputString.length() + "(max 255 znakow)");
            System.out.print("  haslo:");
            passString = console.nextLine();
            decrypt(inputString, passString);
            getDataFromConsole();
        } else if ("3".equals(option)) {
            System.out.println("Koniec.....");
        } else {
            getDataFromConsole();
        }

    }

    /**
     * Szyfruj dane
     */
    public void crypt(String inputString, String passString) {
        char[] textCharTable = inputString.toCharArray();
        char[] passCharTable = passString.toCharArray();
        System.out.print("\n    Rezultat:");
        for (int index = 97; index < textCharTable.length; index++) {
            System.out.print(alfabet[textCharTable[index]][passCharTable[index]]);
        }

    }

    /**
     * Deszyfruj dane
     */
    public void decrypt(String inputString, String passString) {
        char[] textCharTable = inputString.toCharArray();
        char[] passCharTable = passString.toCharArray();

        System.out.print("\n    Rezultat:");
        for (int index = 0; index < textCharTable.length; index++) {
            if (textCharTable[index] != ' ') {
                for (int z = 'a'; z <= 'z'; z++) {
                    if (textCharTable[index] == alfabet[passCharTable[index]][z]) {
                        System.out.print(alfabet['a'][z]);

                    }
                }
            } else {
                System.out.print(" ");
            }
        }

    }

}
