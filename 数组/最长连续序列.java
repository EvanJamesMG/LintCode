	/**
		给定一个未排序的整数数组，找出最长连续序列的长度。

		说明
		要求你的算法复杂度为O(n)

		样例
		给出数组[100, 4, 200, 1, 3, 2]，这个最长的连续序列是 [1, 2, 3, 4]，返回所求长度 4
	*/
	
	
	/**
     * 将所有数都加入集合中，然后再遍历这些数，因为我们能O(1)的判断某个数是否在集合中，所以我们可以一个个向上或者向下检查。
     * 为了避免之后重复检查，我们每查到一个数，都要将其从集合中移除。这样每遇到一个数，都检查它的上下边界，就能找出最长的连续数列。
     * 时间复杂度仍是O(N)，因为我们不会检查不存在于数组的数，而存在于数组的数也只会检查一次。
     */
    public static int longestConsecutive(int[] num) {
        // write you code here
        if(num==null||num.length==0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        int maxlen = 0;
        for(int sub:num)
            set.add(sub);
        for(int sub:num){
            int cur = sub,len = 0;
            //向上检查
            while(set.contains(cur)){
                len++;
                set.remove(cur);
                cur++;
            }
            //向下检查
            cur = sub-1;
            while(set.contains(cur)){
                len++;
                set.remove(cur);
                cur--;
            }
            maxlen = Math.max(maxlen,len);
        }
        return maxlen;
    }