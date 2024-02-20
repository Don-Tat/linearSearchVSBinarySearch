public class linearSearch {
    public static int linearSearch(int[] array, int m) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == m) {
                count++;
                return i;
            }
        }
        return count;
    }
}
