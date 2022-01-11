package com.java.base.algorithm;

import java.nio.file.ClosedWatchServiceException;
import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] a = {0, 5, 1, 9, 6, 7, 15, -11, 3, 8, 4

        };
        quicksort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int part = partition(arr, low, high);
            quicksort(arr, low, part - 1);
            quicksort(arr, part + 1, high);
        }
    }
}