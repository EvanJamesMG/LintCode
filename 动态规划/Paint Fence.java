/*
There is a fence with n posts, each post can be painted with one of the k colors.
You have to paint all the posts such that no more than two adjacent fence posts have the same color.
Return the total number of ways you can paint the fence.

 ע������

n and k are non-negative integers.

����
Given n=3, k=2 return 6

      post 1,   post 2, post 3
way1    0         0       1 
way2    0         1       0
way3    0         1       1
way4    1         0       0
way5    1         0       1
way6    1         1       0
*/

/*
 *���ָ���һ�����򣬼����ж����ֽ������Ŀһ�㶼�Ƕ�̬�滮����Ϊ���ǿ��Դ���������еõ�����ʽ��
�������⣬�����г�����������������һ����ɫ��Ҳ����ζ�ŵ���������Ҫô����һ�����Ӳ���һ����ɫ��Ҫô���ڶ������Ӳ���һ����ɫ��
�������ͬһ����ɫ����������Ե�ʱ���Ҫȥ��֮ǰ����ɫ��Ҳ����k-1�ֿ����ԡ�
����dp[1]�ǵ�һ�����Ӽ�֮ǰͿɫ�Ŀ�����������dp[2]�ǵڶ������Ӽ�֮ǰͿɫ�Ŀ�������������dp[3]=(k-1)*dp[1] + (k-1)*dp[2]��

����ʽ���ˣ�������������base��������������е�һ��Ϳɫ�ķ�ʽ��k�У��ڶ���Ϳɫ�ķ�ʽ����k*k����Ϊ�ڶ������ӿ��Ժ͵�һ��һ���� 
 */
 
public class Solution {
    /**
     * @param n non-negative integer, n posts
     * @param k non-negative integer, k colors
     * @return an integer, the total number of ways
     */
    public int numWays(int n, int k) {
        // Write your code here
        // ��n=0ʱ����0
        int dp[] = {0, k , k*k, 0};
        if(n <= 2){
            return dp[n];
        }
        for(int i = 2; i < n; i++){
            // ����ʽ������������Ҫô����һ�����Ӳ���һ����ɫ��Ҫô���ڶ������Ӳ���һ����ɫ
            dp[3] = (k - 1) * (dp[1] + dp[2]);
            dp[1] = dp[2];
            dp[2] = dp[3];
        }
        return dp[3];
    }
}