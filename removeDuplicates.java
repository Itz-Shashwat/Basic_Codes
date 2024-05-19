import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int[] expectedNums=new int[nums.length];
        Boolean flag=false;
        int counting=0;
        for(int i=0;i<nums.length;i++){
            flag=false;
            for(int j=0;j<counting;j++){
                if(nums[i]==expectedNums[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                expectedNums[counting]=nums[i];
                counting++;
            }
        }
        Arrays.fill(nums,0);
        for (int i = 0; i < counting; i++) {
            nums[i] = expectedNums[i];
        }
        return counting;
    }
}