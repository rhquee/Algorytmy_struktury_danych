package com.company.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-19.
 */
public class Lists {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        //dodanie elementu do listy
        myList.add(1);
        myList.add(10);
        myList.add(20);
        //wyciąganie konkretnego elementui
        //listy są indeksowane tak jak tablice, od 0
        int elem0 = myList.get(0);
        int elem1 = myList.get(1);
        //sprawdzenie rozmiaru
        int listSize = myList.size();
    }
}
