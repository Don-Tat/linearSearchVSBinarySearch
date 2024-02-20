import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements to create in the array: ");
        int n = input.nextInt();
        System.out.println("Enter the number of elements to search for in the array: ");
        int m = input.nextInt();
        //create an array of n random integers where the range of integers is from 0 to 2n
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * n * 2);
        }
        //create an array of m random integers where the range of integers is from 0 to 2n
        int[] search = new int[m];
        for (int i = 0; i < m; i++) {
            search[i] = (int) (Math.random() * n * 2);
        }
        //sort both arrays
        Arrays.sort(array);
        Arrays.sort(search);
        // create a stopwatch object for linear search
        Stopwatch stopwatchLinear = new Stopwatch();
        //search for each element in the search array in the array using linear search
        for (int i = 0; i < m; i++) {
            int index = linearSearch.linearSearch(array, search[i]);
        }
        double timeLinear = stopwatchLinear.elapsedTime();
        System.out.println("Linear search time: " + timeLinear + " seconds");
        // create a stopwatch object for binary search
        Stopwatch stopwatchBinary = new Stopwatch();
        //search for each element in the search array in the array using binary search
        for (int i = 0; i < m; i++) {
            int index = binarySearch.binarySearch(array, search[i]);
        }
        double timeBinary = stopwatchBinary.elapsedTime();
        System.out.println("Binary search time: " + timeBinary + " seconds");
    }
}
