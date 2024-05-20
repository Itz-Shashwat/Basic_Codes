import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        char[] ctr = s.toLowerCase().toCharArray(); 
        char[] ctr1 = new char[ctr.length];
        char[] ctr2 = new char[ctr1.length];
        int j = 0;
        
        for (int i = 0; i < ctr.length; i++) {
            if (Character.isLetterOrDigit(ctr[i])) {
                ctr1[j++] = ctr[i];
            }
        }
        
        int k = j - 1; 
        for (int i = 0; i < j; i++) {
            ctr2[k--] = ctr1[i];
        }
        
        String str1 = new String(ctr1, 0, j); 
        String str2 = new String(ctr2, 0, j);
        return str1.equals(str2);
    }
}
