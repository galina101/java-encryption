public class Lab {
    /**
     * @param nums a list of ints.
     * @return a list of ints that is in the reversed order of nums.
     */
    public int[] reverse(int[] nums){


        int[] reversedArray = new int[nums.length];
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            reversedArray[j] = nums[i];
            j++;
        }


        return reversedArray;
    }
}
