import java.util.*;
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h_index = 0;

        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                h_index = n - i;
                break;
            }
        }
        return h_index;
    }
}
