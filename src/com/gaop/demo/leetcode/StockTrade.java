package com.gaop.demo.leetcode;

/**
 * @description 	
 * 	leetCode-������һ�����飬���ĵ� i ��Ԫ����һ�������Ĺ�Ʊ�ڵ� i ��ļ۸����һ���㷨���ҵ����������������ɾ����ܶ�Ľ��ף����������Ʊ����Ȼ�����㲻��ͬʱ���������ף���������ٴι���ǰ���۹�Ʊ����
 * @author gaop
 * @date 2018��4��3�� ����11:11:59
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
