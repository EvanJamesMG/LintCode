/*
 *解题思路：这道题也很tricky，自己想是很难想出来的。如果sum(gas)<sum(cost)的话，那么一定无解。

  diff是走完一站邮箱剩下的油，如果加上gas[i]也到不了下一站，那么继续将下一站设置为起点，然后再检查，
  是不是很巧妙呢？ 
*/

public class Solution {
    /**
     * @param gas: an array of integers
     * @param cost: an array of integers
     * @return: an integer
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	int sumgas = 0;
    	int sumcost = 0;
    	for(int sub:gas)
    		sumgas +=sub;
    	for(int sub:cost)
    		sumcost += sub;
    	
    	if(sumgas<sumcost)
    		return -1;
    	int diff = 0;
    	int stationindex = 0;
    	for(int i=0;i<gas.length;i++){
    		if(diff+gas[i]<cost[i]){
    			stationindex = i+1;
    			diff = 0;
    		}else{
    			diff += gas[i] - cost[i];
    		}
    	}
    	return stationindex;
    }
}