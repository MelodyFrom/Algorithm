package com.gaop.demo.leetcode;

public class Backpack {

	public int solution(int capacity, int number, int[] weight, int[] values) {
		// maxValue[number][capacity]��ʾǰi����Ʒǡ����һ������Ϊm�ı������Ի�õ�����ֵ
		int[][] maxValue = new int[number+1][capacity+1]; 
		// ��ʼ��
		for (int i = 0; i < number + 1; i++)
			maxValue[i][0] = 0;
		for (int i = 0; i < capacity + 1; i++) {
			maxValue[0][i] = 0;
		
		}
		return 0;
	}
}
