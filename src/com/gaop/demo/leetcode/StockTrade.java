package com.gaop.demo.leetcode;

/**
 * @description 	
 * 	leetCode-假设有一个数组，它的第 i 个元素是一个给定的股票在第 i 天的价格。设计一个算法来找到最大的利润。你可以完成尽可能多的交易（多次买卖股票）。然而，你不能同时参与多个交易（你必须在再次购买前出售股票）。
 * @author gaop
 * @date 2018年4月3日 下午11:11:59
 */
public class StockTrade {

	
	
	public static int maxProfit(int[] prices) {
		if(prices.length == 0)
			return 0;
		int maxValue = 0;
		for (int i = 1; i < prices.length; i++) {
			if(prices[i-1] < prices[i])
				maxValue += prices[i] - prices[i-1];
		}
		return maxValue;
	}
	
	public static void main(String[] args) {
		int[] values = new int[]{0, 1, 2, 1, 4, 5};
		System.out.println(maxProfit(values));
	}
	
}
