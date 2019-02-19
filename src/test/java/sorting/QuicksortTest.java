package sorting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuicksortTest {

    Quicksort unit;
    
    @BeforeAll
    static void setUpBeforeClass() throws Exception {

    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {


    }

    @Test
    void whenListIntegerGivenThenReturnArrayList() {

        assertEquals(new ArrayList<Integer>(Arrays.asList(1)), unit.quicksort(Arrays.asList(1)));
    }
}
