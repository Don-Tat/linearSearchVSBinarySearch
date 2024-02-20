import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements to create in the array: ");
        int n = input.nextInt();
        System.out.println("Enter the number of elements to search for in the array: ");
        int m = input.nextInt();
        // create an array of n random integers where the range of integers is from 0 to
        // 2n
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * n * 2);
        }
        // create an array of m random integers where the range of integers is from 0 to
        // 2n
        int[] search = new int[m];
        for (int i = 0; i < m; i++) {
            search[i] = (int) (Math.random() * n * 2);
        }
        // sort both arrays
        Arrays.sort(array);
        Arrays.sort(search);

        int linearSum = 0;
        int binarySum = 0;

        Stopwatch timerLinear = new Stopwatch();
        for (int i = 0; i < m; i++) {
            int count = linearSearch.linearSearch(array, search[i]);
            linearSum += count;
        }
        System.out.println("Time to search for all elements in the search array in the array using linear search: "
                + timerLinear.elapsedTime() + " seconds. " + linearSum + " elements found.");

        Stopwatch timerBinary = new Stopwatch();
        // search for each element in the search array in the array using binary search
        // and print the amount of times each element is found
        for (int i = 0; i < m; i++) {
            int count = binarySearch.binarySearch(array, search[i]);
            binarySum += count;
        }
        System.out.println("Time to search for all elements in the search array in the array using binary search: "
                + timerBinary.elapsedTime() + " seconds. " + binarySum + " elements found.");
    }
}
