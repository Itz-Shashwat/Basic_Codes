import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp_array=new int[nums.length];
        int n=nums.length;
        k=k % n;
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++){
            temp_array[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length-k;i++){
            temp_array[j]=nums[i];
            j++;
        }
        Arrays.fill(nums,0);
        for(int i=0;i<nums.length;i++){
            nums[i]=temp_array[i];
        }
    }
}