package _08_Built_In_Classes;

import java.util.*;

public class _10_Collections_And_Arrays_Class {
    public static void main(String[] args) {

        // Arrays Class: operations on arrays
        int[] numbers = {5, 2, 8, 3, 1};

        // Sorting
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Binary search (array must be sorted)
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3 in sorted array: " + index);

        // Fill array with a value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        // Copy array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));


        // Collections Class: operations on collections
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 20, 15));

        // Sort the list
        Collections.sort(list);
        System.out.println("\nSorted List: " + list);

        // Reverse the list
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // Shuffle the list randomly
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // Find max and min
        int maxValue = Collections.max(list);
        int minValue = Collections.min(list);
        System.out.println("Max value: " + maxValue);
        System.out.println("Min value: " + minValue);

        // Frequency: count how many times an element appears
        list.add(10); // adding duplicate
        int freq = Collections.frequency(list, 10);
        System.out.println("Frequency of 10: " + freq);

        // Rotate the list
        Collections.rotate(list, 2); // rotates last 2 elements to front
        System.out.println("Rotated List: " + list);

        // Swap two elements
        Collections.swap(list, 0, 1);
        System.out.println("After swapping index 0 and 1: " + list);

        // Notes:
        // Arrays class: works on arrays; methods include sort, binarySearch, fill, copyOf
        // Collections class: works on collections (List, Set, etc.);
        // methods include sort, reverse, shuffle, max, min, frequency, rotate, swap

    }
}
