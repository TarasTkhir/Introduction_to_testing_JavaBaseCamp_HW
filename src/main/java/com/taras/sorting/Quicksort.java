package com.taras.sorting;

import com.taras.exception.ListIsEmptyException;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {

    public ArrayList<Integer> quicksort(List<Integer> listToSort) {

        if (listToSort.size() <= 1) {

            return new ArrayList<Integer>(listToSort);

        }
        int middle = (int) Math.ceil((double) listToSort.size() / 2);
        int fixedMidle = listToSort.get(middle);

        List<Integer> less = new ArrayList<Integer>();
        List<Integer> greater = new ArrayList<Integer>();

        for (int i = 0; i < listToSort.size(); i++) {
            if (listToSort.get(i) <= fixedMidle) {
                if (i == middle) {
                    continue;
                }
                less.add(listToSort.get(i));
            } else {
                greater.add(listToSort.get(i));
            }
        }

        return (ArrayList<Integer>) addListToList(quicksort(less), fixedMidle, quicksort(greater));
    }

    public List<Integer> addListToList(List<Integer> less, int fixedMidle, List<Integer> greater) {

        List<Integer> resultList = new ArrayList<Integer>();

        for (int i = 0; i < less.size(); i++) {
            resultList.add(less.get(i));
        }

        resultList.add(fixedMidle);

        for (int i = 0; i < greater.size(); i++) {
            resultList.add(greater.get(i));
        }

        return resultList;
    }

}

