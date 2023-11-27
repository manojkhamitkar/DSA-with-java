/* Bubble Sort Algorithm */
package Sorting_Algorithm;

import java.util.*;

public class BubbleSorting {
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // n-1 iterations/passes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                /*
                 * last i elements are already at correct sorted positions,
                 * so no need to check them
                 */
                if (arr[j] > arr[j + 1]) {
                    // swap - arr[j], arr[j+1]
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;

                }

            }
        }

    }


            System.out.print(i + " ");
        }

    }

}

