package com.gaop.demo.chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * @description 	
 * 	��ģ����ɫ����Ϸ���Խ������ͳ��
 * @author gaop
 * @date 2017��6��22�� ����10:26:36
 */
public class Dice {
	
	//��������,�ٶ�Ϊ6
	private static int MAX = 6;

	public static void main(String[] args) {
		System.out.println("�����뱾��ģ������ɫ�ӵ��ܴ���:");
		Scanner scan = new Scanner(System.in);
		Integer totalTimes = scan.nextInt();
		Random rd = new Random();
		Map<Integer, Integer> resultCount = new HashMap<>();
		resultCount.put(1, 0);
		resultCount.put(2, 0);
		resultCount.put(3, 0);
		resultCount.put(4, 0);
		resultCount.put(5, 0);
		resultCount.put(6, 0);
		for(int i = 0; i < totalTimes; i++){
			int result = rd.nextInt(MAX);
			switch (result) {
			case 0:
				resultCount.put(1, resultCount.get(1) + 1);
				break;
			case 1:
				resultCount.put(2, resultCount.get(2) + 1);
				break;
			case 2:
				resultCount.put(3, resultCount.get(3) + 1);
				break;
			case 3:
				resultCount.put(4, resultCount.get(4) + 1);
				break;
			case 4:
				resultCount.put(5, resultCount.get(5) + 1);
				break;
			case 5:
				resultCount.put(6, resultCount.get(6) + 1);
				break;
			}
		}

		System.out.println(resultCount);
	}
}
