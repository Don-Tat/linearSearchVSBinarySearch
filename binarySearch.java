public class binarySearch {
    public static int binarySearch(int[] array, int m) {
        int count = 0;
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (m < array[mid]) {
                high = mid - 1;
            } else if (m > array[mid]) {
                low = mid + 1;
            } else {
                count++;
                return mid;
            }
        }
        return count;
    }
}
