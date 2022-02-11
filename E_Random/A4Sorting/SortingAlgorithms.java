package E_Random.A4Sorting;

public class SortingAlgorithms {

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sortVal = arr[i];



            while (i > 0 && arr[i - 1] > sortVal) {  // hier wird geprüft, ob der Vorgänger größer war
                arr[i] = arr[i - 1]; //falls ja, wird die aktuelle Stelle zum Vorgänger
                i--; //hier gehts zurück zum Vorgänger, falls die größer-Bedingung nicht erfüllt ist
            }
            arr[i] = sortVal;
        }
        return arr;
    }

}
