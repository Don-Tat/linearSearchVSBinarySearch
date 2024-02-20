public class binarySearch {
    public static int binarySearch(int[] array, int m) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == m) {
                return mid;
            } else if (array[mid] < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
