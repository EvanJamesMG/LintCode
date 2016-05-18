/**
	给定一组 n 个不同大小的 nuts 和 n 个不同大小的 bolts。nuts 和 bolts 一一匹配。 不允许将 nut 之间互相比较，也不允许将 bolt 之间互相比较。
	也就是说，只许将 nut 与 bolt 进行比较， 或将 bolt 与 nut 进行比较。请比较 nut 与 bolt 的大小。

	样例
	Nuts 用一个整数数组表示 nuts [] = {1, 5, 8, 2}. Bolts 也用一个整数数组表示 bolts[] = {3, 6, 7, 9}. 
	我们将提供一个比较函数，以比较 nut 与 bolt 的大小。
	将 nuts 进行升序排序，使得 nuts 与 bolts 位置对等。
*/

/**
 * 方法一：
 * 两次排序 O(n^2)
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
 * 方法二：
 *quick sort非常好的题。用bolts[high]将nuts partition成两部分，得到中间值pivot，再用nuts[pivot]将bolts分成两部分。再对pivot两边进行recursion
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
            //比基准点小就换到左边
            if (compare.cmp(strs[i], pivot) == -1 || compare.cmp(pivot, strs[i]) == 1) {
                j++;
                swap(strs, i, j);
            }
            //是基准点就换到最右边
            else if (compare.cmp(strs[i], pivot) == 0 ||compare.cmp(pivot, strs[i]) == 0) {
                swap(strs, i,h);
                i--;
            }
        }
        j++;
        //将基准点换到相应的位置上，并返回基准点相应的位置坐标
        swap(strs, j,h);
        return j;
    }
    private static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}