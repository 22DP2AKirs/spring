package rvt;

import java.util.Arrays;

public class Sorter {
    // * Sorting (5 parts). Galvenā, kopējā programma.
    public int[] numberArray;

    // Sorter objektam dod savu skaitļu masīvu.
    public Sorter(int[] numberArray) {
        this.numberArray = numberArray;
    }

    public int indexOfSmallest(int[] numberArray) {
        // Ja pārbaudot rodas kāda kļūda, tad atgriezīs -1.
        int indexOfSmallest = -1;
        for (int i = 0; i < numberArray.length; i++) {
            if (smallest(numberArray) == numberArray[i]) {
                indexOfSmallest = i;
                break;
            }
        }
        return indexOfSmallest;
    }

    public int smallest (int[] numberArray) {
        // Kā mazāko elementu paņem masīva pirmo elementu.
        int smallestNumber = numberArray[0];
        // Ja kāds elements ir mazāks par [0], tad tas elements tiek saglabāts kā jaunais mazākais.
        for (int number : numberArray) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }

    public int indexOfSmallestFrom(int[] numberArray, int startIndex) {
        int smallestNumber = numberArray[startIndex];
        int indexOfSmallestNumber = startIndex;
        // Ja kāds elements ir mazāks par smallestNumber, tad tas elements tiek saglabāts kā jaunais mazākais.
        for (int i = startIndex; i < numberArray.length; i++) {
            if (numberArray[i] < smallestNumber) {
                smallestNumber = numberArray[i];
                indexOfSmallestNumber = i;
            }
        }
        return indexOfSmallestNumber;
    }

    public void swap(int[] numberArray, int index1, int index2) {
        int waitingNumber = numberArray[index2];
        numberArray[index2] = numberArray[index1];
        numberArray[index1] = waitingNumber;
    }

    public void sort(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            swap(numberArray, i, indexOfSmallestFrom(numberArray, i));
        }
    }

    public int binarySearch (int[] sortedNumberArray, int searchedNumber) {
        int arrayStartIndex = 0;
        int arrayEndIndex = sortedNumberArray.length - 1; // Masīva gala elements.

        while (arrayStartIndex <= arrayEndIndex) {
            int middleIndex = (arrayEndIndex + arrayStartIndex) / 2;

            if (sortedNumberArray[middleIndex] == searchedNumber) {
                return middleIndex;
            }

            if (sortedNumberArray[middleIndex] < searchedNumber) {
                arrayStartIndex = middleIndex + 1;
            }

            if (sortedNumberArray[middleIndex] > searchedNumber) {
                arrayEndIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
