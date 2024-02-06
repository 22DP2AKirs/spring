package lv.rvt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;
import rvt.Sorter;

public class SorterTest {
    
    @Test
    public void sortingPartOne() {
        int[] numbers = { 6 , 5 , 8 , 7 , 11 };
        Sorter algoritm = new Sorter(numbers);

        System.out.println("Smallest: " + algoritm.smallest(numbers));
    }

    @Test
    public void sortingPartTwo() {
        int[] numbers = { 6 , 5 , 8 , 7 , 11 };
        Sorter algoritm = new Sorter(numbers);

        // Index of the smallest number.
        assertEquals(1, algoritm.indexOfSmallest(numbers));
    }

    @Test
    public void sortingPartThree() {
        int[] numbers = { -1 , 6 , 9 , 8 , 12 };
        Sorter algoritm = new Sorter(numbers);

        // Index of the smallest number from.
        assertEquals(0, algoritm.indexOfSmallestFrom(numbers, 0));
        assertEquals(1, algoritm.indexOfSmallestFrom(numbers, 1));
        assertEquals(3, algoritm.indexOfSmallestFrom(numbers, 2));
    }

    @Test
    public void sortingPartFour() {
        int[] numbers = { 3 , 2 , 5 , 4 , 8 };
        Sorter algoritm = new Sorter(numbers);

        assertEquals("[3, 2, 5, 4, 8]", Arrays.toString(algoritm.numberArray));

        algoritm.swap(algoritm.numberArray, 1, 0);
        assertEquals("[2, 3, 5, 4, 8]", Arrays.toString(algoritm.numberArray));
        
        algoritm.swap(algoritm.numberArray, 0, 3);
        assertEquals("[4, 3, 5, 2, 8]", Arrays.toString(algoritm.numberArray));
    }

    @Test
    public void sortingPartFive() {
        int[] numbers = { 8 , 3 , 7 , 9 , 1 , 2 , 4 };
        Sorter algoritm = new Sorter(numbers);

        algoritm.sort(algoritm.numberArray);
        assertEquals("[1, 2, 3, 4, 7, 8, 9]", Arrays.toString(algoritm.numberArray));
    }

    @Test
    public void binarySearch() {
        int[] numbers = { 8 , 3 , 7 , 9 , 1 , 2 , 4 };
        Sorter algoritm = new Sorter(numbers);

        // Sortots masīvs.        int[] numbers = { 1 , 2 , 3 , 4 , 7 , 8 , 9 };
        algoritm.sort(algoritm.numberArray);
        assertEquals(2, algoritm.binarySearch(algoritm.numberArray, 3));
        assertEquals(5, algoritm.binarySearch(algoritm.numberArray, 8));
    }
}
