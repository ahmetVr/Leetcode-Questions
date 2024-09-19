import java.util.HashSet;

public class LongestSubstringWithoutCharacters {
       public int lengthOfLongestSubstring(String s) {
        int pointer1 = 0;
        int pointer2 = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<>();

        while(pointer1 < s.length()) {
            if(!set.contains(s.charAt(pointer1))) {
                set.add(s.charAt(pointer1));
                pointer1++;
                max = Math.max(set.size(),max);
            } else {
                set.remove(s.charAt(pointer2));
                pointer2++;
            }
        }
        return max;
    }

}
