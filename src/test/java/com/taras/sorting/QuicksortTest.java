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

        System.out.println( "Time " + (System.currentTimeMillis() - startTime) + "Ms");
        System.out.println("End");
    }

    @Test()
    void testQuicksortExceptionWhenListIsEmpty() {


    }


    @Test
    void testQuicksortIsArrayListReturned() {


    }

    @Test
    void testQuicksortLessListSizeThan2() {

    }

    @Test
    void testQuicksortIsSortingWrite() {

    }

    @Test
    void testQuicksortIsSortingWrong() {

    }

}