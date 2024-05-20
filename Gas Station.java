class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int current_tank = 0;
        int index = 0;

        for(int i=0;i<gas.length;i++){
            tank+=gas[i]-cost[i];
            current_tank+=gas[i]-cost[i];
            if(current_tank<0){
                index=i+1;
                current_tank=0;
            }
        }
        return tank>=0?index:-1;
    }
}
