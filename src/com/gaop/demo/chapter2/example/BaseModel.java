package com.gaop.demo.chapter2.example;

/**
 * @description 	
 * 	�����㷨ģ����
 * @author gaop
 * @date 2017��9��28�� ����7:26:55
 */
public abstract class BaseModel<T> {

	/**
	 * ���򷽷�,������㷨ʵ������Ҫʵ��������򷽷���ʵ������㷨�������߼�
	 * @param arg
	 */
	public abstract void sort(Comparable<T>[] arg);
	
	/**
	 * �����ӡ����
	 * @param arg
	 */
	public void show(Comparable<T>[] arg) {
		for(Comparable<T> a : arg) {
			System.out.print(a.toString() + " ");
		}
		System.out.println();
	}
	
	/**
	 * �����������±�a��b������Ԫ�ص�λ��
	 * @param arg
	 * @param a
	 * @param b
	 */
	public void exch(Comparable<T>[] arg, int a, int b) 
	{
		Comparable<T> bridge = arg[a];
		arg[a] = arg[b];
		arg[b] = bridge;
		//release it for GC
		bridge = null;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
	
	/**
	 * �ж������Ƿ�����,�˴������ǽ��������׼�ж�
	 * @param arg
	 * @return
	 */
	public boolean isSorted(Comparable<T>[] arg) {
		for(int i = 0;i < arg.length-1; i++) {
			if(this.less(arg[i], arg[i+1])) {
				return false;
			}
		}
		return true;
	}
	
}
