package com.gaop.demo.chapter1.unionFind.entity;

/**
 * @description 	
 * 	��ͨ�������㷨API
 * @author gaop
 * @date 2017��8��20�� ����1:13:46
 */
public class UF {
	
	private int[] id;  //����id
	
	private int count;  //��������

	/**
	 * ��������ʶ(0��N-1)��ʼ��N������
	 * @param N
	 */
	public UF(int N) {
		count = N;  //���캯����ʼ���ķ�������
		for(int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	/**
	 * ��p��q֮�����һ������
	 * @param p
	 * @param q
	 */
	public void union(int p, int q) {
		
	}
	
	/**
	 * p���ڵķ����ı�ʶ��
	 */
	public int find(int q) {
		return 0;
	}
	
	/**
	 * ���p��q������ͬһ���������򷵻�true
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean connected(int p, int q) {
		return this.find(p) == this.find(q);
	}
	
	/**
	 * ��ͨ����������
	 * @return
	 */
	int count() {
		return count;
	}
}
