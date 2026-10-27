import models.src.Selection;
import src.InsertionSort;

public class App {
    public static void main(String[] args) throws Exception {

        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        // Bubble Sort
        System.out.println("Bubble");
        Bubble bubble = new Bubble();
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        // Selection Sort
        System.out.println("Selection");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        // Insertion Sort
        System.out.println("Insertion");
        InsertionSort insertion = new InsertionSort();
        printArreglo(d);
        insertion.sort(d);
        printArreglo(d);
    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }
}
