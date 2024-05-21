class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int temp;
        int temp_max = 0;
        int max = 0;
        int[] result = new int[2];
        while (i < j) {
            temp = j - i;
            if (height[i] <= height[j]) {
                temp_max = temp * height[i];
                if (temp_max > max) {
                    max = temp_max;
                    result[0] = i;
                    result[1] = j;
                }
                i++; 
            } else {
                temp_max = temp * height[j];
                if (temp_max > max) {
                    max = temp_max;
                    result[0] = i;
                    result[1] = j;
                }
                j--;  
            }
        }

        return max;
    }
}
