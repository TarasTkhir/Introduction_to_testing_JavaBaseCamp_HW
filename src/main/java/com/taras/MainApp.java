package com.taras;

import com.taras.sorting.Quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainApp {

    public static void main(String[] args){

        List<Integer> appList = new ArrayList<Integer>(Arrays.asList(12,22,55,2,6,9,0,3,85,25,76,87,22,34,55,20,77,13,21));

        new Quicksort().quicksort(appList).forEach(System.out::println);
    }
}