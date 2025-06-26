class P27RemoveElement {
    // A Basic method that swaps two values.
    // Not strictly needed, as we will return just the number of values in the list that
    // do not include the value in question. Needed only if we intend to return the actual list.
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static int removeElement(int[] arr, int val) {
        // Get the array/list length.
        int n = arr.length;
        // Count how many encounters we have with integers that are NOT val
        int j = 0;
        for (int i = 0; i < n; i++) {
                if (arr[i] != val) {
                    // Move all "val" instances to the end (or equivalently, all non-"val" instances to the beginning)
                    swap(arr, i, j);
                    j++;
                }
        }
        // Return those encounters
        return j;
    }

    public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 4, 4, 5, 1};
            System.out.println(removeElement(arr, 4));
    }

}
