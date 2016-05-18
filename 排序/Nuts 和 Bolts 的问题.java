/**
	����һ�� n ����ͬ��С�� nuts �� n ����ͬ��С�� bolts��nuts �� bolts һһƥ�䡣 ������ nut ֮�以��Ƚϣ�Ҳ������ bolt ֮�以��Ƚϡ�
	Ҳ����˵��ֻ�� nut �� bolt ���бȽϣ� �� bolt �� nut ���бȽϡ���Ƚ� nut �� bolt �Ĵ�С��

	����
	Nuts ��һ�����������ʾ nuts [] = {1, 5, 8, 2}. Bolts Ҳ��һ�����������ʾ bolts[] = {3, 6, 7, 9}. 
	���ǽ��ṩһ���ȽϺ������ԱȽ� nut �� bolt �Ĵ�С��
	�� nuts ������������ʹ�� nuts �� bolts λ�öԵȡ�
*/

/**
 * ����һ��
 * �������� O(n^2)
 */
public void sortNutsAndBolts(String[] nuts, String[] bolts, NBComparator compare) {
    // write your code here
    for(int i=0;i<nuts.length;i++){
        for(int j=i;j<bolts.length;j++){
            if(compare.cmp(nuts[i],bolts[j])==0){
                String tem = nuts[i];
                nuts[i] = bolts[j];
                nuts[j] = tem;
            }
        }
    }
}

/**
 * ��������
 *quick sort�ǳ��õ��⡣��bolts[high]��nuts partition�������֣��õ��м�ֵpivot������nuts[pivot]��bolts�ֳ������֡��ٶ�pivot���߽���recursion
 */
    public void sortNutsAndBolts(String[] nuts, String[] bolts, NBComparator compare) {
        // write your code here
        if(nuts==null||nuts.length==0)
            return;
        sort(nuts, bolts, 0, nuts.length - 1, compare);
    }
    public void sort(String[] nuts, String[] bolts, int low, int high, NBComparator compare) {
        if(low < high){
            int pivot_index = partition(nuts, low,high, bolts[high], compare);
            partition(bolts, low,high,nuts[pivot_index], compare);
            sort(nuts, bolts, low, pivot_index-1,compare);
            sort(nuts, bolts, pivot_index+1, high,compare);
        }
    }
    // Similar to standard partition method. Here we pass the pivot element
    // too instead of choosing it inside the method.
    public int partition(String[] strs, int l, int h, String pivot, NBComparator compare) {
        int j = l-1;
        for (int i = l; i < h; i++) {
            //�Ȼ�׼��С�ͻ������
            if (compare.cmp(strs[i], pivot) == -1 || compare.cmp(pivot, strs[i]) == 1) {
                j++;
                swap(strs, i, j);
            }
            //�ǻ�׼��ͻ������ұ�
            else if (compare.cmp(strs[i], pivot) == 0 ||compare.cmp(pivot, strs[i]) == 0) {
                swap(strs, i,h);
                i--;
            }
        }
        j++;
        //����׼�㻻����Ӧ��λ���ϣ������ػ�׼����Ӧ��λ������
        swap(strs, j,h);
        return j;
    }
    private static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}