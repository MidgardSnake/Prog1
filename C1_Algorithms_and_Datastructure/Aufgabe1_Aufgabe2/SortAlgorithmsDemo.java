package Aufgabe1_Aufgabe2;

import java.util.Arrays;

public class SortAlgorithmsDemo {

    public static void main(String[] args) {

        // Test selectionSort
        int[] selectionArray = { 1, 4, 5, 2, 7, 3, 2, 9 };
        System.out.println("Pre applying selectionSort" + Arrays.toString(selectionArray));
        Aufgabe1_Aufgabe2.SortAlgorithms.selectionSort(selectionArray);
        System.out.println("Post applying selectionSort" + Arrays.toString(selectionArray));

        // Test insertionSort
        int[] insertionArray = { 1, 4, 5, 2, 7, 3, 2, 9 };
        System.out.println("Pre applying insertionSort" + Arrays.toString(insertionArray));
        Aufgabe1_Aufgabe2.SortAlgorithms.insertionSort(insertionArray);
        System.out.println("Post applying insertionSort" + Arrays.toString(insertionArray));

    }

}

