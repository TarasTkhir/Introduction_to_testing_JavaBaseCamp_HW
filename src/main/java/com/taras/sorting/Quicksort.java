package com.taras.sorting;

import com.taras.exception.ListIsEmptyException;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {

    public ArrayList<Integer> quicksort(List<Integer> listToSort) {

        if (listToSort.isEmpty()) {

            throw new ListIsEmptyException(" in method quicksort, class Quicksort");

        } else if (listToSort.size() == 1) {

            return new ArrayList<Integer>(listToSort);

        } else {
//      Easy method
//		ArrayList<Integer> sorted =  (ArrayList<Integer>) listToSort.stream().sorted().collect(Collectors.toList());
//			return sorted;

            ArrayList<Integer> result = new ArrayList<Integer>(listToSort);

            Integer forSort;

            for (int i = 0; i < result.size() - 1; i++) {
                for (int j = i + 1; j < result.size(); j++) {
                    if (result.get(i) > result.get(j)) {
                        forSort = result.get(i);
                        result.add(i, result.get(j));
                        result.remove(i + 1);
                        result.add(j, forSort);
                        result.remove(j + 1);
                    }
                }
            }
            return result;

        }

    }
}
