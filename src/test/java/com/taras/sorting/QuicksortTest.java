package com.taras.sorting;

import com.taras.sorting.Quicksort;
import com.taras.exception.ListIsEmptyException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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

    @Test()
    void testQuicksortExceptionWhenListIsEmpty() {

        List<Integer> testUnitList = new LinkedList<Integer>();

        assertThrows(RuntimeException.class, () -> unitForTestingQuicksortClass.quicksort(testUnitList));

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
    void testQuicksortLessListSizeThan2() {
        List<Integer> testSizeList = Arrays.asList(1);
        int inputSize = testSizeList.size();
        int outputSize = unitForTestingQuicksortClass.quicksort(testSizeList).size();
        assertEquals(outputSize, inputSize);
    }

    @Test
    void testQuicksortIsSortingWrite() {

        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)),
                unitForTestingQuicksortClass.quicksort(new LinkedList<Integer>(Arrays.asList(5, 7, 8, 1, 2, 3, 4, 6, 10, 9))));

    }

    @Test
    void testQuicksortIsSortingWrong() {

        assertNotEquals(new ArrayList<Integer>(Arrays.asList(50, 25, 75, 100, 125, 150)),
                unitForTestingQuicksortClass.quicksort(Arrays.asList(50, 25, 75, 100, 125, 150)));

    }

}