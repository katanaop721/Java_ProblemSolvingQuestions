package EasyLevelDSA.Array_Questions;

import java.util.Arrays;

public class FindMedianOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2, 4};
        int n = arr1.length;
        int m = arr2.length;

        // Merge the two arrays
        int[] sumarr = new int[m + n];
        int ptr = 0;

        // Copy elements from arr1
        for (int i = 0; i < n; i++) {
            sumarr[ptr] = arr1[i];
            ptr++;
        }

        // Copy elements from arr2
        for (int i = 0; i < m; i++) {
            sumarr[ptr] = arr2[i];
            ptr++;
        }

        // Sort the merged array
        Arrays.sort(sumarr);

        // Find the median
        double median;
        if (sumarr.length % 2 == 0) {
            int mid1 = sumarr.length / 2;
            int mid2 = mid1 - 1;
            median = (sumarr[mid1] + sumarr[mid2]) / 2.0;
        } else {
            median = sumarr[sumarr.length / 2];
        }

        System.out.println("Median: " + median);
    }
}
