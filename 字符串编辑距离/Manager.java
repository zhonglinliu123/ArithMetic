package test;

public class Manager {
    public Integer getEditDistance(String s1 , String s2){
        // dp[i][j]表示从i个字符变成j个字符需要的操作步数
        int[][] dp = new int[s1.length()+1][s2.length()+1];

        for(int i=0; i<s1.length()+1; i++){
            // 当从i个字符变成0个字符，需要i步(删除)
            dp[i][0] = i;
        }

        for(int i=0; i<s2.length()+1; i++){
            // 当从0个字符变成i个字符，需要i步(增加)
            dp[0][i] = i;
        }

        for(int i=1; i<s1.length()+1; i++){
            for(int j=1; j<s2.length()+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    //当不同的时候，我们需要求三种操作的最小值
                    //其中dp[i - 1][j - 1]表示的是替换，dp[i - 1][j]表示删除字符，do[i][j - 1]表示的是增加字符
                    dp[i][j] = Math.min(dp[i-1][j-1] , Math.min(dp[i-1][j] ,dp[i][j-1])) + 1;
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
