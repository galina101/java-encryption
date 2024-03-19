import java.util.Arrays;

public class Lab {
    /**
     * An anagram is a word that is the reordering of another word's letters.
     * Letter counts must be exact.
     *
     * @param s1 a word.
     * @param s2 another word, possibly an anagram of s1.
     * @return True if s2 is an anagram of s1, false otherwise.
     */
    public boolean check(String s1, String s2){
        //If s1 and s2 are not of the same length,
        // return false because anagrams must have the same number of letters.
        if(s1.length() != s2.length()){
            return false;
        }

        //Convert both s1 and s2 to character arrays
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        //Sort both character arrays
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array, s2Array);
    }

}
