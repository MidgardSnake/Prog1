package E_Random.A4Sorting;


import java.util.Arrays;

public class SortAlgorithmsDemo {public static void main(String[] args) {

    // Test selectionSort
    int[] selectionArray = { 4, 1, 5, 2, -7, 3, 2, 9 };
    System.out.println("Pre applying selectionSort" + Arrays.toString(selectionArray));
    SortingAlgorithms.selectionSort(selectionArray);
    System.out.println("Post applying selectionSort" + Arrays.toString(selectionArray));



    // Test insertionSort
    int[] insertionArray = { 4, 1, 5, 2, -7, 3, 2, 9 };
    System.out.println("Pre applying insertionSort" + Arrays.toString(insertionArray));
    SortingAlgorithms.insertionSort(insertionArray);
    System.out.println("Post applying insertionSort" + Arrays.toString(insertionArray));

}

}

