public class linearSearch {
    public static int linearSearch(int[] array, int m) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == m) {
                return i;
            }
        }
        return -1;
    }
}
