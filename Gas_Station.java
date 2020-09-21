 Greedy-> O(n)
Two observations :
i) If car starts at A and can not reach B. Any station between A and B can not reach B.
ii) sum(gas) < sum(cost) then No solution exist


class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length,start=0;
        int gas_sum=0, cost_sum=0, tank=0;
        for(int i=0;i<n;i++){
            gas_sum += gas[i];
            cost_sum += cost[i];
            tank += gas[i] - cost[i];
            if(tank < 0){
                start = i+1;
                tank = 0;
            }
        }
        return gas_sum < cost_sum ? -1 : start;
    }   
}