/*
代码库的版本号是从 1 到 n 的整数。某一天，有人提交了错误版本的代码，因此造成自身及之后版本的代码在单元测试中均出错。

请找出第一个错误的版本号。

你可以通过 isBadVersion 的接口来判断版本号 version 是否在单元测试中出错，具体接口详情和调用方法请见代码的注释部分。

 注意事项

请阅读上述代码，对于不同的语言获取正确的调用 isBadVersion 的方法，比如java的调用方式是VersionControl.isBadVersion

样例
给出 n=5

调用isBadVersion(3)，得到false

调用isBadVersion(5)，得到true

调用isBadVersion(4)，得到true

此时我们可以断定4是第一个错误的版本号
*/


/**
 * public class SVNRepo {
 *     public static boolean isBadVersion(int k);
 * }
 * you can use SVNRepo.isBadVersion(k) to judge whether 
 * the kth code version is bad or not.
*/
class Solution {
    /**
     * @param n: An integers.
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
    	int left = 1;
    	int right = n;
    	int mid = 0;
    	int res = -1;
    	while(left<=right){
    		mid = (left+right)/2;
    		if(SVNRepo.isBadVersion(mid)==false){
    			left = mid+1;
    		}else{
    			right = mid-1;
    		}
    	}
		return left;    
        
    }
}
