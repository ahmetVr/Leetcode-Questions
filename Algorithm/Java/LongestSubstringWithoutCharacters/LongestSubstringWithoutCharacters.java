import java.util.HashSet;

/* 
Given a string s, find the length of the longest substring
without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/



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
