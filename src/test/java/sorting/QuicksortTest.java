package sorting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuicksortTest {

    private static Quicksort unit;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {

        unit =new Quicksort();
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {

     unit =null;
    }

    @Test
    void whenListIntegerGivenThenReturnArrayList() {

        assertEquals(new ArrayList<Integer>(Arrays.asList()), unit.quicksort(Arrays.asList()));
    }

    @Test
    void whenListSizeLessThat2ThenReturnSameListConvertedToArrayList(){

        assertEquals(new ArrayList<Integer>(Arrays.asList(1)), unit.quicksort(Arrays.asList(1)));
    }
    @Test
    void whenTwoListOfGreaterAndLessNumbersAndMiddleNumberIsGivenThenReturnListAddedToMiddleNumberAndToList(){

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),unit.addListToList(Arrays.asList(1, 2, 3, 4, 5),
                6, Arrays.asList(7, 8, 9, 10)));
        assertEquals(Arrays.asList(3,2,1,4,5,6,9,10,8,7),unit.addListToList(Arrays.asList(3, 2, 1, 4, 5),
                6, Arrays.asList(9, 10, 8, 7)));
        assertEquals(Arrays.asList(75,25,50,100,150,125,175),unit.addListToList(Arrays.asList(75, 25, 50),
                100, Arrays.asList(150,125,175)));
    }

    @Test
    void whenListGivenThenReturnIndexOfMiddleNumber(){

        assertEquals(2,unit.middleNumberIndex(Arrays.asList(3,5,8,1,9,6)));
        assertEquals(3,unit.middleNumberIndex(Arrays.asList(3,5,8,1,9,6,7)));
    }

    @Test
    void whenListGivenThenReturnListWhereValuesAreLessThanValueOfMidleIndexOrEqualsToIt(){

        assertEquals(Arrays.asList(5,7,7,8), unit.getLessList(Arrays.asList(5,7,12,9,7,8,10)));
        assertEquals(Arrays.asList(1,2,3,1), unit.getLessList(Arrays.asList(1,2,3,4,1,6,7)));

    }
    @Test
    void whenListGivenThenReturnListWhereValuesAreGreaterThanValueOfMidleIndex(){

        assertEquals(Arrays.asList(12,10), unit.getGreaterList(Arrays.asList(5,7,12,9,7,8,10)));
        assertEquals(Arrays.asList(6,7), unit.getGreaterList(Arrays.asList(1,2,3,4,1,6,7)));

    }
}
