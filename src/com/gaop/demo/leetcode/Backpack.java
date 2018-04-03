package com.gaop.demo.leetcode;

public class Backpack {
	
    public static void main(String[] args) {
    	int val[] = {10, 40, 30, 50}; // 物品价值数组, 总计有4件物品,价值各异.
        int wt[] = {5, 4, 6, 3}; // 物品重量数组
        int W = 10; // 背包总容量
        System.out.println(solution(W, wt, val));
	}

    /**
     * @description
     * 	背包价值计算方法
     * @param capacity 背包容量值
     * @param weight 物品重量数组
     * @param values 物品价值数组
     * @return 给定参数下的背包容纳物品的最大价值
     */
	public static int solution(int capacity, int[] weights, int[] values) {
		// maxValue[number][capacity]对应表示前i件物品恰放入一个重量为m的背包可以获得的最大价值
		int[][] maxValue = new int[weights.length+1][capacity+1]; 
		/**初始化**/
		for (int i = 0; i <= capacity; i++)
			maxValue[0][i] = 0;
		for (int i = 0; i <= weights.length; i++)
			maxValue[i][0] = 0;
		
		for (int item = 1; item <= weights.length; item++) {
			// 逐行填充数据
			for (int weight = 1; weight <= capacity; weight++) {
				if(weights[item - 1] <= weight) 
				{
					maxValue[item][weight] = Math.max(values[item - 1] + maxValue[item - 1][weight - weights[item - 1]],
							maxValue[item - 1][weight]);
				} else {
					maxValue[item][weight] = maxValue[item - 1][weight];
				}
			}
		}
		
		/* 打印二维数组 */
		for (int[] is : maxValue) {
			for (int i : is) {
				System.out.format("%5d", i);
			}
			System.out.println();
		}
		
		return maxValue[weights.length][capacity];
	}
}
