import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> window = new LinkedList<Character>();
        int result = 0;
        int length = 0;
        while(s.length() > 0) {
            while(window.contains(s.charAt(0))) {
                window.remove();
                length--;
            }
            window.add(s.charAt(0));
            length++;
            if(length>result) {result = length;}
            s = s.substring(1);
        }
        return result;
        
        
    }
}