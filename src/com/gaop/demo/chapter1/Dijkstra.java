package com.gaop.demo.chapter1;

import java.util.Scanner;
import java.util.Stack;

/**
 * @description
 * 	Dijkstra˫ջ�������ʽ���� <br>
 * 	����һ�������ַ���(���ʽ)��������ʽ��ֵ.�������ʽ������һ����,������һ���������š�һ���������ʽ��һ�����������һ��
 * �������ʽ��һ�����������.<b>�ص�������ν��������š��������������ɵ��ַ�����������ȷ��˳�������������.</b> <br>
 * 	������ջ�ṹ��������������(һ�������ջ��һ��������ջ),�����ʽ�����������δ���:<br>
 * 	1. ����������ջ������ջ <br>
 *  2. ���������ջ�����ջ <br>
 *  3. ���������� <br>
 *  4. ����������ʱ,����һ�������������Ĳ�����,����������Ͳ������ļ�����ѹ�������ջ <br>
 *  ���������һ�������ź�,������ջ�Ͼ�ֻ����һ��ֵ�����ʽ��ֵ.ÿ���㷨����һ�������Ű�Χ����һ���������������������ɵ��ӱ��ʽ
 * ʱ,������㲢�������ջ.�൱����ʽ�ӵ�ֵ�����ʽ�ӱ���.���Ƿ���Ӧ��������ɲ�����õ�һ������ֵ.
 * @author gao
 *
 */
public class Dijkstra {

	//�����ջ
	static Stack<String> operators = new Stack<>();
	//������ջ
	static Stack<Integer> numbers = new Stack<>();
	
	public static void main(String[] args) {
		System.out.println("�����������ʽ: ");
		Scanner in = new Scanner(System.in);
		String[] paramArg = in.nextLine().split(" ");
		for(String param : paramArg)
		{
			if(isOperator(param))
			{
				operators.push(param);
			}
			else if(isRightBrackets(param))
			{
				numbers.push(calculator(numbers.pop(), numbers.pop(), operators.pop()));
			}
			else {
				//judge number
				Integer paramNumber = parseNumber(param);
				if(null != paramNumber)
				{
					numbers.push(paramNumber);
				}
			}
		}
		System.out.println("�������ʽ��ֵΪ: " + numbers.peek());
	}
	
	private static Integer parseNumber(String number) {
		try {
			 return Integer.parseInt(number);
		} catch (Exception ex) {
			return null;
		}
	}
	
	private static int calculator(int paramA, int paramB, String operator) {
		if("+".equals(operator))
			return paramA + paramB;
		else if("-".equals(operator))
			return paramA - paramB;
		else if("*".equals(operator))
			return paramA * paramB;
		else if("/".equals(operator))
			return paramA / paramB;
		else
			return 0;
	}
	
	private static boolean isOperator(String opr) {
		if("+".equals(opr))
			return true;
		else if ("-".equals(opr))
			return true;
		else if("*".equals(opr))
			return true;
		else if("/".equals(opr))
			return true;
		else
			return false;
	}
	
	private static boolean isRightBrackets(String bracket) {
		if(")".equals(bracket)) 
			return true;
		return false;
	}
	
}
