public class ArrayCalculations {
    public static void main(String[] args) {
        // Initialize arrays
        int[] arr1 = {4, 7, 1, 9, 2, 6};
        int[][] arr2 = {
            {3, 5, 8, 10},
            {2, 7, 4, 1},
            {6, 9, 12, 11}
        };

        // Find max, min, and average for arr1
        int maxArr1 = findMax(arr1);
        int minArr1 = findMin(arr1);
        double avgArr1 = findAverage(arr1);

        // Find max, min, and average for arr2
        int maxArr2 = findMax(arr2);
        int minArr2 = findMin(arr2);
        double avgArr2 = findAverage(arr2);

        // Print results for arr1
        System.out.println("Array 1:");
        System.out.println("Maximum: " + maxArr1);
        System.out.println("Minimum: " + minArr1);
        System.out.println("Average: " + avgArr1);

        // Print results for arr2
        System.out.println("\nArray 2:");
        System.out.println("Maximum: " + maxArr2);
        System.out.println("Minimum: " + minArr2);
        System.out.println("Average: " + avgArr2);
    }

    // Find maximum value in a 1D array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // Find maximum value in a 2D array
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) max = num;
            }
        }
        return max;
    }

    // Find minimum value in a 1D array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    // Find minimum value in a 2D array
    public static int findMin(int[][] arr) {
        int min = arr[0][0];
        for (int[] row : arr) {
            for (int num : row) {
                if (num < min) min = num;
            }
        }
        return min;
    }

    // Calculate average for a 1D array
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Calculate average for a 2D array
    public static double findAverage(int[][] arr) {
        int sum = 0, count = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
                count++;
            }
        }
        return (double) sum / count;
    }
}
