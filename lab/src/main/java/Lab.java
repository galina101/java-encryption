import java.util.Arrays;

public class Lab {
    /**
     * @param arr an array of ints.
     * @return the second highest value of arr.
     */
    public int getValue(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array length must be at least 2");
        }
        Arrays.sort(arr);

        //highest is the last element in the array
        int highest = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != highest) {
                return arr[i];
            }
        }
        throw new IllegalArgumentException(("Array must contain at least two unique elements."));

    }
}
