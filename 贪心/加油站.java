/*
 *����˼·�������Ҳ��tricky���Լ����Ǻ���������ġ����sum(gas)<sum(cost)�Ļ�����ôһ���޽⡣

  diff������һվ����ʣ�µ��ͣ��������gas[i]Ҳ��������һվ����ô��������һվ����Ϊ��㣬Ȼ���ټ�飬
  �ǲ��Ǻ������أ� 
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