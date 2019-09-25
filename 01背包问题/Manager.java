package test;

public class Manager {
    /**
     *
     * @param weights 物品i的重量为wi
     * @param values 物品i的价值为vi
     * @param capacity 背包总的容量为c
     * @return 能装入背包的总价值
     */
    public Integer getOptimumSolution(int[] weights , int[] values , int capacity){
        if(weights.length != values.length){
            throw new IllegalArgumentException();
        }
        if(capacity <= 0 || weights.length <= 0){
            return 0;
        }
        //result[i][j] 表示 在背包容量剩余j的时候考虑到第i件物品的最大价值（i从0还是计数）
        int[][] result = new int[weights.length][capacity+1];

        for(int i=0; i<capacity+1; i++){
            if(weights[0] > i){
                result[0][i] = 0;
            }else{
                result[0][i] = values[0];
            }
        }

        for(int i=1; i<weights.length; i++){
            for(int j=0; j<capacity+1; j++){
                if(weights[i] > j){
                    result[i][j] = result[i-1][j];
                }else{
                    result[i][j] = Math.max(result[i-1][j] , result[i-1][j-weights[i]]+values[i]);
                }
            }
        }

        return result[weights.length-1][capacity];
    }
}
