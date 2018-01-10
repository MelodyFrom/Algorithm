package com.gaop.demo.chapter1;

import java.util.Scanner;
import java.util.Stack;

/**
 * @description
 * 	Dijkstra双栈算数表达式计算 <br>
 * 	接受一个输入字符串(表达式)并输出表达式的值.算术表达式可以是一个数,或者是一个由左括号、一个算数表达式、一个运算符、另一个
 * 算数表达式和一个右括号组成.<b>重点在于如何解析由括号、运算符和数字组成的字符串并按照正确的顺序完成算数运算.</b> <br>
 * 	用两个栈结构可以完成这个任务(一个运算符栈和一个操作数栈),将表达式从左至右依次处理:<br>
 * 	1. 将操作数入栈操作数栈 <br>
 *  2. 将运算符入栈运算符栈 <br>
 *  3. 忽略左括号 <br>
 *  4. 遇到右括号时,弹出一个运算符和所需的操作数,并将运算符和操作数的计算结果压入操作数栈 <br>
 *  操作完最后一个右括号后,操作数栈上就只会有一个值即表达式的值.每当算法遇到一个被括号包围并由一个运算符和两个操作数组成的子表达式
 * 时,都会计算并将结果入栈.相当于用式子的值替代了式子本身.我们反复应用这个规律并计算得到一个最终值.
 * @author gao
 *
 */
public class Dijkstra {

	//运算符栈
	static Stack<String> operators = new Stack<>();
	//操作数栈
	static Stack<Integer> numbers = new Stack<>();
	
	public static void main(String[] args) {
		System.out.println("输入算数表达式: ");
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
		System.out.println("算数表达式的值为: " + numbers.peek());
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
