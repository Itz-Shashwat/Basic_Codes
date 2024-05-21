class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int length=numbers.length;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>target){
                length=i;
                break;
            }
        }
        int left=0;
        int right=numbers.length-1;
        int sum=0;
        while(left<right){
            sum=numbers[left]+numbers[right];
            if(sum==target){
                result[0]=left+1;
                result[1]=right+1;
                break;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
}