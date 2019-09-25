package test;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        // 定义数组的三种方式   new int[x]      {....}       new int[]{....}
        int[] weights = new int[]{4, 6, 2, 2, 5, 1};
        int[] values = new int[]{8, 10, 6, 3, 7, 2};
        int capacity = 12;
        Integer result = manager.getOptimumSolution(weights , values ,capacity);
        System.out.println(result);
    }
}
