package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description 	
 * 	<b>ϣ������</b> <br>
 * 	���ڲ��������һ���Ż��㷨,���������ʺ������ڽ�С���������򳡾�,�ϴ������������ʺ�ʹ��ϣ������.
 * ��ȷһ�������"h��������",����һ��������,ÿ��h��Ԫ�ؼ��Ԫ����ɵ�һ�������������,��������Щ�ϴ�����������ǿ���
 * һ�ξͰ�һ��Ŀ��Ԫ���ƶ�����Զ��λ��.���·�������������Ⱦʹ������Ե�����,��Ϊ��������һ��ֻ�ܰ�Ԫ���ƶ�һ����λ����.
 * @author gaop
 * @date 2017��11��12�� ����10:19:17
 */
public class Shell<E> extends BaseModel<Integer>{

	@Override
	public void sort(Comparable<Integer>[] arg) {
		int n = arg.length;
		int h = 1;
		while(h < n/3)
		{
			h = h*3 + 1;//1, 4, 13, 40, 121...
		}
		while(h >= 1)
		{
			for(int i = h; i < n; i++) 
			{
				for(int j = i; j >= h && super.less(arg[j], arg[j-h]); j -= h)
				{
					super.exch(arg, j, j-h);
				}
			}
			h = h/3;
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = new Integer[]{10, 15, 0, 4, 6, 12, 20, 1};
		BaseModel<Integer> base = new Shell<>();
		base.show(a);
		base.sort(a);
		base.show(a);
	}
}
