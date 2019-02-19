package sorting;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {

    public ArrayList<Integer> quicksort(List<Integer> listToSort) {

        if (listToSort.size() <= 1) {

            return new ArrayList<Integer>(listToSort);
        }

        return new ArrayList<Integer>(listToSort);
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

    public int middleNumberIndex(List<Integer> listToSort) {

        return (int) ((Math.ceil((double) listToSort.size() / 2))-1);

    }

    public List<Integer> getLessList(List<Integer> listToSort) {

        int middle = middleNumberIndex(listToSort);
        int fixedMiddle = listToSort.get(middle);

        List<Integer> less = new ArrayList<Integer>();

        for (int i = 0; i < listToSort.size(); i++) {
            if (listToSort.get(i) <= fixedMiddle) {
                if (i == middle) {
                    continue;
                }
                less.add(listToSort.get(i));
            }
        }
        return less;
    }

    public List<Integer> getGreaterList(List<Integer> listToSort) {

        int middle = middleNumberIndex(listToSort);
        int fixedMiddle = listToSort.get(middle);

        List<Integer> greater = new ArrayList<Integer>();

        for (int i = 0; i < listToSort.size(); i++) {
            if (listToSort.get(i) > fixedMiddle) {
                if (i == middle) {
                    continue;
                }
                greater.add(listToSort.get(i));
            }
        }
        return greater;
    }
}
