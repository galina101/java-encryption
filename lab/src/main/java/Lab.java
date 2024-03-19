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

        if(s1.length() != s2.length()){
            return false;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);


        return Arrays.equals(s1Array, s2Array);
    }

}
