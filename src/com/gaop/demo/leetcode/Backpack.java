package com.gaop.demo.leetcode;

public class Backpack {
	
    public static void main(String[] args) {
    	int val[] = {10, 40, 30, 50}; // ��Ʒ��ֵ����, �ܼ���4����Ʒ,��ֵ����.
        int wt[] = {5, 4, 6, 3}; // ��Ʒ��������
        int W = 10; // ����������
        System.out.println(solution(W, wt, val));
	}

    /**
     * @description
     * 	������ֵ���㷽��
     * @param capacity ��������ֵ
     * @param weight ��Ʒ��������
     * @param values ��Ʒ��ֵ����
     * @return ���������µı���������Ʒ������ֵ
     */
	public static int solution(int capacity, int[] weights, int[] values) {
		// maxValue[number][capacity]��Ӧ��ʾǰi����Ʒǡ����һ������Ϊm�ı������Ի�õ�����ֵ
		int[][] maxValue = new int[weights.length+1][capacity+1]; 
		/**��ʼ��**/
		for (int i = 0; i <= capacity; i++)
			maxValue[0][i] = 0;
		for (int i = 0; i <= weights.length; i++)
			maxValue[i][0] = 0;
		
		for (int item = 1; item <= weights.length; item++) {
			// �����������
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
		
		/* ��ӡ��ά���� */
		for (int[] is : maxValue) {
			for (int i : is) {
				System.out.format("%5d", i);
			}
			System.out.println();
		}
		
		return maxValue[weights.length][capacity];
	}
}
