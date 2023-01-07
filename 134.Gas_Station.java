https://leetcode.com/problems/gas-station/
Jan-7

-----------------------------------------------------------------------

//first check that wheterh gas>cost or not if not return -1
//iterate over gas and find the start pointer
//the start pointer should be at which gas>cost 
//if remaining_gas<0 , start = i+1

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
     
 //first check that wheterh gas>cost or not if not return -1
        int gas_x = 0;
        int cost_x = 0;
        for(int i=0; i<gas.length; i++){
            gas_x += gas[i];
            cost_x += cost[i];
        }  
        if(gas_x<cost_x){
            return -1;
        }
        int start = 0;
        int remaining_gas = 0;
        for(int i=0; i<gas.length; i++){
            remaining_gas = remaining_gas + gas[i]-cost[i];
            if(remaining_gas<0){
                start = i+1;
                remaining_gas=0;
            }
        }
        return start;     
    }
}
-------------------------------------------
