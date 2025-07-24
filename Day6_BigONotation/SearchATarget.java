package Day6_BigONotation;

import java.util.Arrays;
import java.util.Random;

public class SearchATarget {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

   
    public static int[] generateArray(int size, int bound) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(bound);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};

        for (int n : sizes) {
            System.out.println("Dataset Size " + n );

            int[] data = generateArray(n, n * 2);
            int target = data[new Random().nextInt(n)]; 

        
            long start = System.nanoTime();
            linearSearch(data, target);
            long end = System.nanoTime();
            System.out.println("Linear Search Time: " + (end - start) / 1_000_000.0 + " ms");

            Arrays.sort(data);

            start = System.nanoTime();
            binarySearch(data, target);
            end = System.nanoTime();
            System.out.println("Binary Search Time: " + (end - start) / 1_000_000.0 + " ms");

            System.out.println();
        }
    }
}
