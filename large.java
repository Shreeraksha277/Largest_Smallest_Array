public static int findLargest(int[] arr) {
    int max = arr[0];   // assume first element is largest

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
