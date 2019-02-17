package com.taras.sorting;

import com.taras.exception.ListIsEmptyException;
import com.taras.sorting.Quicksort;
import com.taras.exception.ListIsEmptyException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class QuicksortTest {
    private static long startTime;

    private static Quicksort unitForTestingQuicksortClass;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {

        unitForTestingQuicksortClass = new Quicksort();

        startTime = System.currentTimeMillis();
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {

        unitForTestingQuicksortClass = null;

        System.out.println("Time " + (System.currentTimeMillis() - startTime) + "Ms");
        System.out.println("End");
    }


    @Test
    void testQuicksortIsArrayListReturned() {

        assertEquals(new ArrayList<Integer>(Arrays.asList(1)), unitForTestingQuicksortClass.quicksort(Arrays.asList(1)));
    }

    @Test
    void testQuicksortIsNotArrayListReturned() {

        assertNotEquals(new LinkedHashSet<Integer>(Arrays.asList(1)), unitForTestingQuicksortClass.quicksort(Arrays.asList(1)));
    }

    @Test
    void testQuicksortSameSizeReturned() {
        List<Integer> testSizeList = Arrays.asList(1);
        int inputSize = testSizeList.size();
        int outputSize = unitForTestingQuicksortClass.quicksort(testSizeList).size();
        assertEquals(outputSize, inputSize);

        testSizeList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int inputSize1 = testSizeList.size();
        int outputSize1 = unitForTestingQuicksortClass.quicksort(testSizeList).size();
        assertEquals(outputSize, inputSize);
    }

    @Test
    void testQuicksortIsSortingWrite() {

        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)),
                unitForTestingQuicksortClass.quicksort(new LinkedList<Integer>(Arrays.asList(5, 7, 8, 1, 2, 3, 4, 6, 10, 9))));

        assertEquals(new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 500)),
                unitForTestingQuicksortClass.quicksort(new ArrayList<Integer>(Arrays.asList(300, 500, 100, 400, 200))));

        assertEquals(new ArrayList<Integer>(Arrays.asList(25, 50, 75, 100, 125, 150)),
                unitForTestingQuicksortClass.quicksort(Arrays.asList(25, 50, 75, 100, 125, 150)));
    }

    @Test
    void testQuicksortIsSortingWrong() {

        assertNotEquals(new ArrayList<Integer>(Arrays.asList(50, 25, 75, 100, 125, 150)),
                unitForTestingQuicksortClass.quicksort(Arrays.asList(50, 25, 75, 100, 125, 150)));

        assertNotEquals(new ArrayList<Integer>(Arrays.asList(5, 7, 8, 1, 2, 3, 4, 6, 10, 9)),
                unitForTestingQuicksortClass.quicksort(Arrays.asList(5, 7, 8, 1, 2, 3, 4, 6, 10, 9)));

        assertNotEquals(new ArrayList<Integer>(Arrays.asList(200, 100, 300, 400, 500)),
                unitForTestingQuicksortClass.quicksort(Arrays.asList(500, 200, 300, 400, 100)));

        assertNotEquals(new ArrayList<Integer>(Arrays.asList(1, 2, 5, 7, 9, 8)),
                unitForTestingQuicksortClass.quicksort(Arrays.asList(9, 8, 7, 5, 2, 1)));
    }

    @Test()
    void testAddListToListIsWriteDataReturned() {

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                unitForTestingQuicksortClass.addListToList(Arrays.asList(1, 2, 3, 4, 5),
                        6, Arrays.asList(7, 8, 9, 10)));
        assertEquals(Arrays.asList(3,2,1,4,5,6,9,10,8,7),
                unitForTestingQuicksortClass.addListToList(Arrays.asList(3, 2, 1, 4, 5),
                        6, Arrays.asList(9, 10, 8, 7)));
        assertEquals(Arrays.asList(75,25,50,100,150,125,175),
                unitForTestingQuicksortClass.addListToList(Arrays.asList(75, 25, 50),
                        100, Arrays.asList(150,125,175)));
    }

    @Test()
    void testAddListToListIsWrongDataReturned() {

        assertNotEquals(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10),
                unitForTestingQuicksortClass.addListToList(Arrays.asList(1, 2, 3, 4),
                        5, Arrays.asList(6, 7, 8, 9, 10)));
        assertNotEquals(Arrays.asList(0,2,0,2,0,2,0,2,0,2),
                unitForTestingQuicksortClass.addListToList(Arrays.asList(0,2,0,2),
                        2, Arrays.asList(2,0,2,0,2)));
        assertNotEquals(Arrays.asList(100,125,150,175,200),
                unitForTestingQuicksortClass.addListToList(Arrays.asList(100,125,150),
                        200, Arrays.asList(175)));

    }


}