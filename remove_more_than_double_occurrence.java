import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int[] temp=new int[nums.length];
        int count=0;
        int tem=nums[0]-1;
        int j=0;
        int flaging=0;
        for(int i=0;i<nums.length;i++){
            if(tem==nums[i]){
                count++;
            }
            else{
                tem=nums[i];
                count=0;
            }
            if(count<2){
                temp[j]=tem;
                flaging++;
                j++;
            }
        }
        for (int i = 0; i < flaging; i++) {
            nums[i] = temp[i];
        }     
        return flaging;
    }
}