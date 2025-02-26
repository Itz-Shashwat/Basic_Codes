import java.util.*;
public class Max_length_substring {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        char ctr[] =s.toCharArray();
        StringBuilder sb;
        HashSet<Character> hs;
        int i=0;
        for(char c:ctr){
            sb=new StringBuilder();
            hs= new HashSet<Character>();
            hs.add(c);
            sb.append(c);
            for(int j=i+1;j<ctr.length;j++){
                if (!hs.contains(ctr[j])) {
                    sb.append(ctr[j]);
                    hs.add(ctr[j]);
                } else {
                    break;
                }
            }
            max=Math.max(max,sb.length());
            i++;
        }
        return max;
    }
}